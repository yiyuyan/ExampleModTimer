package cn.ksmcbrigade.emt.mixin;

import cn.ksmcbrigade.vmr.uitls.ModuleUtils;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "getTickTargetMillis",at = @At("RETURN"), cancellable = true)
    public void getTick(float p_311597_, CallbackInfoReturnable<Float> cir){
        if(ModuleUtils.enabled("Timer")){
            cir.setReturnValue(cir.getReturnValue()/5.8F);
        }
    }
}
