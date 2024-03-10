package anmao.mc.nm.gui;

import anmao.mc.amlib.color._ColorCDT;
import anmao.mc.amlib.math._Random;
import anmao.mc.nm.NM;
import anmao.mc.nm.data_type.MusicGuiData;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;

import java.awt.event.KeyEvent;
import java.util.HashMap;

public class MusicGui{
    public static final String id = "music";
    public static final ResourceLocation circle = new ResourceLocation(NM.MOD_ID,"textures/gui/music/circle.png");
    public static final int circleSize = 64;
    public static final ResourceLocation rings = new ResourceLocation(NM.MOD_ID,"textures/gui/music/rings.png");
    public static final int ringsSize = 64;
    public static final HashMap<Integer,MusicGuiData> musicKey = new HashMap<>();
    public static boolean run = false;
    public static void KeyPress(int key){
        if (musicKey.get(key) != null){
            musicKey.remove(key);
        }
    }
    public static void handle(CompoundTag data){
        ListTag musics = data.getList("musics", Tag.TAG_COMPOUND);
        for (int i = 0; i < musics.size();i ++){
            CompoundTag m = musics.getCompound(i);
            musicKey.put(m.getInt("key"),new MusicGuiData(
                    m.getInt("x"),
                    m.getInt("y"),
                    m.getInt("w"),
                    m.getInt("h"),
                    m.getInt("maxTime"),
                    m.getFloat("r"),
                    m.getFloat("g"),
                    m.getFloat("b"),
                    m.getFloat("a"),
                    m.getInt("textColor")
            ));
        }
    }
    public static void render(ForgeGui gui, GuiGraphics guiGraphics, float partialTick, int screenWidth, int screenHeight) {
        if (musicKey.isEmpty()){
            musicKey.put(GLFW.GLFW_KEY_A,new MusicGuiData(32,32,100,255.0f,0.0f,0.0f,1.0f));
            musicKey.put(GLFW.GLFW_KEY_S,new MusicGuiData(32,32,100,255.0f,255.0f,0.0f,0.5f));
            musicKey.put(GLFW.GLFW_KEY_D,new MusicGuiData(32,32,100,0.0f,255.0f,255.0f,1.0f));
            musicKey.put(GLFW.GLFW_KEY_F,new MusicGuiData(32,32,70,0.5f));
            musicKey.put(GLFW.GLFW_KEY_G,new MusicGuiData(32,32,80,0.6f));
            musicKey.put(GLFW.GLFW_KEY_H,new MusicGuiData(32,32,90,0.7f));
            musicKey.put(GLFW.GLFW_KEY_J,new MusicGuiData(32,32,100,255.0f));
            run = true;
        }else {
            HashMap<Integer,MusicGuiData> keyCopy = new HashMap<>(musicKey);
            keyCopy.forEach((s, musicData) -> {
                if (musicData != null) {
                    musicData.time--;
                    RenderSystem.setShaderColor(musicData.r, musicData.g, musicData.b, musicData.a);
                    guiGraphics.blit(circle, musicData.x - musicData.w / 2, musicData.y - musicData.h / 2, musicData.w, musicData.h, 0, 0, circleSize, circleSize, circleSize, circleSize);
                    float l = 1 + ((float) musicData.time / musicData.maxTime);
                    int rw = (int) (musicData.w * l);
                    int rh = (int) (musicData.h * l);
                    guiGraphics.blit(rings, musicData.x - rw / 2, musicData.y - rh / 2, rw, rh, 0, 0, ringsSize, ringsSize, ringsSize, ringsSize);

                    String string = KeyEvent.getKeyText(s);
                    Font font = Minecraft.getInstance().font;
                    guiGraphics.drawString(font,string,musicData.x - font.lineHeight / 2,musicData.y - font.width(string) / 2,musicData.textColor,false);
                    if (musicData.time < 0) {
                        musicKey.remove(s);
                    }else {
                        musicKey.put(s,musicData);
                    }
                }
            });
            if (musicKey.isEmpty()){
                run = false;
            }
        }
    }
    private static void drawArc(PoseStack poseStack, int centerX, int centerY, int innerRadius, int outerRadius, int startAngle, int endAngle, int color) {
        float f = (color >> 24 & 255) / 255.0F;
        float f1 = (color >> 16 & 255) / 255.0F;
        float f2 = (color >> 8 & 255) / 255.0F;
        float f3 = (color & 255) / 255.0F;

        RenderSystem.enableBlend();
        //RenderSystem.disableTexture();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader(GameRenderer::getPositionColorShader);

        Tesselator tesselator = Tesselator.getInstance();
        BufferBuilder bufferBuilder = tesselator.getBuilder();
        bufferBuilder.begin(VertexFormat.Mode.TRIANGLE_STRIP, DefaultVertexFormat.POSITION_COLOR);

        for (int i = startAngle; i <= endAngle; i++) {
            double angle = Math.toRadians(i);
            double x1 = centerX + Math.sin(angle) * innerRadius;
            double y1 = centerY + Math.cos(angle) * innerRadius;
            double x2 = centerX + Math.sin(angle) * outerRadius;
            double y2 = centerY + Math.cos(angle) * outerRadius;
            bufferBuilder.vertex(poseStack.last().pose(), (float) x1, (float) y1, 0.0F).color(f1, f2, f3, f).endVertex();
            bufferBuilder.vertex(poseStack.last().pose(), (float) x2, (float) y2, 0.0F).color(f1, f2, f3, f).endVertex();
        }
        tesselator.end();
        //RenderSystem.enableTexture();
        RenderSystem.disableBlend();
    }
}
