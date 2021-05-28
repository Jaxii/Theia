package dev.jaxi.mixin;

import net.minecraft.network.listener.ServerPlayPacketListener;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.block.OreBlock;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ServerPlayPacketListener.class)
public interface MixinServerPlayPacketListener {

    @Shadow
    default void onHandSwing(HandSwingC2SPacket packet) {

    }

    @Accessor
    default void onHandSwing() {

    }

}
