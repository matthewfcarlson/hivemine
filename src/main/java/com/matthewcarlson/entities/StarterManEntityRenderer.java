package com.matthewcarlson.entities;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.EndermanBlockFeatureRenderer;
import net.minecraft.client.render.entity.feature.EndermanEyesFeatureRenderer;
import net.minecraft.client.render.entity.model.EndermanEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public class StarterManEntityRenderer extends MobEntityRenderer<StarterManEntity, StarterManModel<StarterManEntity>> {
   private static final Identifier TEXTURE = new Identifier("textures/starterman.png");
   private final Random random = new Random();

   public StarterManEntityRenderer(EntityRendererFactory.Context context) {
      super(context, new StarterManModel(context.getPart(EntityModelLayers.ENDERMAN)), 0.5F);
      //this.addFeature(new EndermanEyesFeatureRenderer(this));
      //this.addFeature(new EndermanBlockFeatureRenderer(this));
   }

   public void render(StarterManEntity endermanEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
      BlockState blockState = endermanEntity.getCarriedBlock();
      StarterManModel<StarterManEntity> endermanEntityModel = (StarterManModel)this.getModel();
      endermanEntityModel.carryingBlock = blockState != null;
      super.render(endermanEntity, f, g, matrixStack, vertexConsumerProvider, i);
   }

   public Identifier getTexture(StarterManEntity endermanEntity) {
      return TEXTURE;
   }
}
