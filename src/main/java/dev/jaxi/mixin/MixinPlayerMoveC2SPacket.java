package dev.jaxi.mixin;


import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(PlayerMoveC2SPacket.class)
public interface MixinPlayerMoveC2SPacket {

    @Accessor("onGround")
    void setOnGround(boolean onGround);

}


