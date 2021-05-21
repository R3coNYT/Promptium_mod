// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class Dragon extends EntityModel<Entity> {
	private final ModelRenderer levre;
	private final ModelRenderer bone;
	private final ModelRenderer peau1;

	public Dragon() {
		textureWidth = 200;
		textureHeight = 200;

		levre = new ModelRenderer(this);
		levre.setRotationPoint(-2.0F, -9.0F, -3.0F);
		levre.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		levre.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.0F, -10.0F, 1.0F);
		bone.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		peau1 = new ModelRenderer(this);
		peau1.setRotationPoint(-2.0F, -8.0F, -2.0F);
		peau1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		peau1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		levre.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
		peau1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}