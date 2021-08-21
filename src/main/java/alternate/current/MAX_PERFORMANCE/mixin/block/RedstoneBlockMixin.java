package alternate.current.MAX_PERFORMANCE.mixin.block;

import org.spongepowered.asm.mixin.Mixin;

import alternate.current.MAX_PERFORMANCE.interfaces.mixin.IBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

@Mixin(RedstoneBlock.class)
public class RedstoneBlockMixin implements IBlock {
	
	@Override
	public boolean emitsWeakPowerTo(World world, BlockPos pos, BlockState state, Direction dir) {
		return true;
	}
}