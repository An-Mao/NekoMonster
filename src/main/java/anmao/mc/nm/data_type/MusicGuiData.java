package anmao.mc.nm.data_type;

import anmao.mc.amlib.color._ColorCDT;
import anmao.mc.amlib.math._Random;
import net.minecraft.client.Minecraft;

public class MusicGuiData {
    public int x;
    public int y;
    public int w;
    public int h;
    public long maxTime;
    public float r;
    public float g;
    public float b;
    public float a;
    public long time;
    public int textColor;
    public MusicGuiData(int x, int y, int w, int h, int maxTime, float r, float g, float b, float a){
        this(x,y,w,h,maxTime,r,g,b,a,_ColorCDT.black);
    }
    public MusicGuiData(int x, int y, int w, int h, int maxTime, float r, float g, float b, float a,int textColor) {
        this.x = x <= 0 ? _Random.getIntRandomNumber(1, Minecraft.getInstance().getWindow().getScreenWidth()) : x;
        this.y = y <= 0 ? _Random.getIntRandomNumber(1, Minecraft.getInstance().getWindow().getScreenHeight()) : y;
        this.w = w <= 0 ? 32 : w;
        this.h = h <= 0 ? 32 : h;
        this.r = r <= 0 ? 255.0f : r;
        this.g = g <= 0 ? 255.0f : g;
        this.b = b <= 0 ? 255.0f : b;
        this.a = a <= 0 ? 1.0f : a;
        this.time = this.maxTime = maxTime;
        this.textColor = textColor <= 0 ? _ColorCDT.black : textColor;
    }
    public MusicGuiData(int w, int h, int maxTime, float r, float g, float b, float a) {
        this(-1,-1,w,h, maxTime,r,g,b,a);
    }
    public MusicGuiData(int w, int h, int maxTime, float a) {
        this(w,h, maxTime,255.0f,255.0f,255.0f,a);
    }

    public MusicGuiData(int maxTime, float a) {
        this(32,32, maxTime,a);
    }
    public MusicGuiData(int w, int h, int maxTime) {
        this(w,h,maxTime,1.0f);
    }
    public MusicGuiData(int maxTime) {
        this(32,32,maxTime);
    }
}
