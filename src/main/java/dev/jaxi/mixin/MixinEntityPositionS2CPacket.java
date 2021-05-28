package dev.jaxi.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.world.BlockRenderView;
import net.minecraft.network.listener.ServerPlayPacketListener;


@Mixin(EntityPositionS2CPacket.class)
public interface MixinEntityPositionS2CPacket {
    @Accessor("x")
    double getX();

    @Accessor("y")
    double getY();

    @Accessor("z")
    double getZ();

    @Accessor("x")
    void setX(double X);

    @Accessor("y")
    void setY(double y);

    @Accessor("z")
    void setZ(double z);
}