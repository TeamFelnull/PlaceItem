package red.felnull.placeitem.tileentity;

import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;

public class PlaceItemTileEntity extends TileEntity {
	protected NonNullList<ItemStack> items = NonNullList.withSize(1, ItemStack.EMPTY);

	public PlaceItemTileEntity() {
		super(PITileEntityTypes.PLACE_ITEM);

	}

	@Override
	public void read(CompoundNBT tag) {
		ItemStackHelper.loadAllItems(tag, items);
	}

	@Override
	public CompoundNBT write(CompoundNBT tag) {
		CompoundNBT tag2 = ItemStackHelper.saveAllItems(tag, items);
		return tag2;
	}

	public NonNullList<ItemStack> getItems() {
		return this.items;
	}
}
