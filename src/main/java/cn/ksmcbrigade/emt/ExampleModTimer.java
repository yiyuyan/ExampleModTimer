package cn.ksmcbrigade.emt;

import cn.ksmcbrigade.vmr.module.Module;
import cn.ksmcbrigade.vmr.uitls.ModuleUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;

@Mod(ExampleModTimer.MODID)
public class ExampleModTimer {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "emt";
    public static TimerModule module = new TimerModule();

    public ExampleModTimer() {
        MinecraftForge.EVENT_BUS.register(this);
        ModuleUtils.add(module);
    }
}
