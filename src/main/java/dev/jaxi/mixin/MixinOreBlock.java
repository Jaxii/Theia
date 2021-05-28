package dev.jaxi.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;






@Mixin(OreBlock.class)
public abstract class MixinOreBlock extends AbstractBlock {


    public MixinOreBlock(Settings settings) {
        super(settings);



    }





}


