package net.mcreator.tabosmprealms.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.tabosmprealms.world.inventory.ShopMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShopScreen extends AbstractContainerScreen<ShopMenu> {
	private final static HashMap<String, Object> guistate = ShopMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ShopScreen(ShopMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tabosmprealms:textures/screens/shop.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + 12 && mouseY < topPos + 36)
			guiGraphics.renderTooltip(font, Component.translatable("gui.tabosmprealms.shop.tooltip_item"), mouseX, mouseY);
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + 34 && mouseY < topPos + 58)
			guiGraphics.renderTooltip(font, Component.translatable("gui.tabosmprealms.shop.tooltip_item1"), mouseX, mouseY);
		if (mouseX > leftPos + 35 && mouseX < leftPos + 59 && mouseY > topPos + 59 && mouseY < topPos + 83)
			guiGraphics.renderTooltip(font, Component.translatable("gui.tabosmprealms.shop.tooltip_item2"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tabosmprealms.shop.label_prix"), 63, 18, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tabosmprealms.shop.label_prix1"), 62, 41, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tabosmprealms.shop.label_prix2"), 62, 61, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tabosmprealms.shop.label_type"), 36, 3, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
