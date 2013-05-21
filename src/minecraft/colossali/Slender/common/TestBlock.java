/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package colossali.Slender.common;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TestBlock extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
			Block.stone.blockID,
		};
	}

	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 1){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public TestBlock() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 8, j, k) || !LocationIsValidSpawn(world, i + 8, j, k + 8) || !LocationIsValidSpawn(world, i, j, k + 8))
		{
			return false;
		}

		world.setBlock(i + 0, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 1, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 7, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 0, 0);
		world.setBlock(i + 0, j + 1, k + 1, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 2, 0);
		world.setBlock(i + 0, j + 1, k + 3, 0);
		world.setBlock(i + 0, j + 1, k + 4, 0);
		world.setBlock(i + 0, j + 1, k + 5, 0);
		world.setBlock(i + 0, j + 1, k + 6, 0);
		world.setBlock(i + 0, j + 1, k + 7, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 0, j + 1, k + 8, 0);
		world.setBlock(i + 0, j + 2, k + 0, 0);
		world.setBlock(i + 0, j + 2, k + 1, 0);
		world.setBlock(i + 0, j + 2, k + 2, 0);
		world.setBlock(i + 0, j + 2, k + 3, 0);
		world.setBlock(i + 0, j + 2, k + 4, 0);
		world.setBlock(i + 0, j + 2, k + 5, 0);
		world.setBlock(i + 0, j + 2, k + 6, 0);
		world.setBlock(i + 0, j + 2, k + 7, 0);
		world.setBlock(i + 0, j + 2, k + 8, 0);
		world.setBlock(i + 0, j + 3, k + 0, 0);
		world.setBlock(i + 0, j + 3, k + 1, 0);
		world.setBlock(i + 0, j + 3, k + 2, 0);
		world.setBlock(i + 0, j + 3, k + 3, 0);
		world.setBlock(i + 0, j + 3, k + 4, 0);
		world.setBlock(i + 0, j + 3, k + 5, 0);
		world.setBlock(i + 0, j + 3, k + 6, 0);
		world.setBlock(i + 0, j + 3, k + 7, 0);
		world.setBlock(i + 0, j + 3, k + 8, 0);
		world.setBlock(i + 0, j + 4, k + 0, 0);
		world.setBlock(i + 0, j + 4, k + 1, 0);
		world.setBlock(i + 0, j + 4, k + 2, 0);
		world.setBlock(i + 0, j + 4, k + 3, 0);
		world.setBlock(i + 0, j + 4, k + 4, 0);
		world.setBlock(i + 0, j + 4, k + 5, 0);
		world.setBlock(i + 0, j + 4, k + 6, 0);
		world.setBlock(i + 0, j + 4, k + 7, 0);
		world.setBlock(i + 0, j + 4, k + 8, 0);
		world.setBlock(i + 0, j + 5, k + 0, 0);
		world.setBlock(i + 0, j + 5, k + 1, 0);
		world.setBlock(i + 0, j + 5, k + 2, 0);
		world.setBlock(i + 0, j + 5, k + 3, 0);
		world.setBlock(i + 0, j + 5, k + 4, 0);
		world.setBlock(i + 0, j + 5, k + 5, 0);
		world.setBlock(i + 0, j + 5, k + 6, 0);
		world.setBlock(i + 0, j + 5, k + 7, 0);
		world.setBlock(i + 0, j + 5, k + 8, 0);
		world.setBlock(i + 1, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 1, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 2, Block.grass.blockID);
		world.setBlock(i + 1, j + 0, k + 3, Block.grass.blockID);
		world.setBlock(i + 1, j + 0, k + 4, Block.grass.blockID);
		world.setBlock(i + 1, j + 0, k + 5, Block.grass.blockID);
		world.setBlock(i + 1, j + 0, k + 6, Block.grass.blockID);
		world.setBlock(i + 1, j + 0, k + 7, Block.dirt.blockID);
		world.setBlock(i + 1, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 0, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 1, j + 1, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 1, k + 2, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 1, j + 1, k + 3, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 1, j + 1, k + 4, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 1, j + 1, k + 5, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 1, j + 1, k + 6, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 1, j + 1, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 1, k + 8, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 1, j + 2, k + 0, 0);
		world.setBlock(i + 1, j + 2, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 2, k + 2, 0);
		world.setBlock(i + 1, j + 2, k + 3, 0);
		world.setBlock(i + 1, j + 2, k + 4, 0);
		world.setBlock(i + 1, j + 2, k + 5, 0);
		world.setBlock(i + 1, j + 2, k + 6, 0);
		world.setBlock(i + 1, j + 2, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 2, k + 8, 0);
		world.setBlock(i + 1, j + 3, k + 0, 0);
		world.setBlock(i + 1, j + 3, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 3, k + 2, 0);
		world.setBlock(i + 1, j + 3, k + 3, 0);
		world.setBlock(i + 1, j + 3, k + 4, 0);
		world.setBlock(i + 1, j + 3, k + 5, 0);
		world.setBlock(i + 1, j + 3, k + 6, 0);
		world.setBlock(i + 1, j + 3, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 3, k + 8, 0);
		world.setBlock(i + 1, j + 4, k + 0, 0);
		world.setBlock(i + 1, j + 4, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 4, k + 2, 0);
		world.setBlock(i + 1, j + 4, k + 3, 0);
		world.setBlock(i + 1, j + 4, k + 4, 0);
		world.setBlock(i + 1, j + 4, k + 5, 0);
		world.setBlock(i + 1, j + 4, k + 6, 0);
		world.setBlock(i + 1, j + 4, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 1, j + 4, k + 8, 0);
		world.setBlock(i + 1, j + 5, k + 0, 0);
		world.setBlock(i + 1, j + 5, k + 1, Block.blockLapis.blockID);
		world.setBlock(i + 1, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 1, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 1, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 1, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 1, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 1, j + 5, k + 7, Block.blockLapis.blockID);
		world.setBlock(i + 1, j + 5, k + 8, 0);
		world.setBlock(i + 2, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 0, k + 1, Block.grass.blockID);
		world.setBlock(i + 2, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 2, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 2, j + 0, k + 4, Block.dirt.blockID);
		world.setBlock(i + 2, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 2, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 2, j + 0, k + 7, Block.grass.blockID);
		world.setBlock(i + 2, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 0, 0);
		world.setBlock(i + 2, j + 1, k + 1, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 2, j + 1, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 2, j + 1, k + 7, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 2, j + 1, k + 8, 0);
		world.setBlock(i + 2, j + 2, k + 0, 0);
		world.setBlock(i + 2, j + 2, k + 1, 0);
		world.setBlock(i + 2, j + 2, k + 2, 0);
		world.setBlock(i + 2, j + 2, k + 4, 0);
		world.setBlock(i + 2, j + 2, k + 5, 0);
		world.setBlock(i + 2, j + 2, k + 6, 0);
		world.setBlock(i + 2, j + 2, k + 7, 0);
		world.setBlock(i + 2, j + 2, k + 8, 0);
		world.setBlock(i + 2, j + 3, k + 0, 0);
		world.setBlock(i + 2, j + 3, k + 1, 0);
		world.setBlock(i + 2, j + 3, k + 2, 0);
		world.setBlock(i + 2, j + 3, k + 3, 0);
		world.setBlock(i + 2, j + 3, k + 4, 0);
		world.setBlock(i + 2, j + 3, k + 5, 0);
		world.setBlock(i + 2, j + 3, k + 6, 0);
		world.setBlock(i + 2, j + 3, k + 7, 0);
		world.setBlock(i + 2, j + 3, k + 8, 0);
		world.setBlock(i + 2, j + 4, k + 0, 0);
		world.setBlock(i + 2, j + 4, k + 1, 0);
		world.setBlock(i + 2, j + 4, k + 2, 0);
		world.setBlock(i + 2, j + 4, k + 3, 0);
		world.setBlock(i + 2, j + 4, k + 4, 0);
		world.setBlock(i + 2, j + 4, k + 5, 0);
		world.setBlock(i + 2, j + 4, k + 6, 0);
		world.setBlock(i + 2, j + 4, k + 7, 0);
		world.setBlock(i + 2, j + 4, k + 8, 0);
		world.setBlock(i + 2, j + 5, k + 0, 0);
		world.setBlock(i + 2, j + 5, k + 1, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 7, Block.glass.blockID);
		world.setBlock(i + 2, j + 5, k + 8, 0);
		world.setBlock(i + 3, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 0, k + 1, Block.grass.blockID);
		world.setBlock(i + 3, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 3, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 3, j + 0, k + 4, Block.dirt.blockID);
		world.setBlock(i + 3, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 3, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 3, j + 0, k + 7, Block.grass.blockID);
		world.setBlock(i + 3, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 0, 0);
		world.setBlock(i + 3, j + 1, k + 1, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 3, j + 1, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 3, j + 1, k + 7, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 3, j + 1, k + 8, 0);
		world.setBlock(i + 3, j + 2, k + 0, 0);
		world.setBlock(i + 3, j + 2, k + 1, 0);
		world.setBlock(i + 3, j + 2, k + 2, 0);
		world.setBlock(i + 3, j + 2, k + 3, 0);
		world.setBlock(i + 3, j + 2, k + 4, 0);
		world.setBlock(i + 3, j + 2, k + 5, 0);
		world.setBlock(i + 3, j + 2, k + 7, 0);
		world.setBlock(i + 3, j + 2, k + 8, 0);
		world.setBlock(i + 3, j + 3, k + 0, 0);
		world.setBlock(i + 3, j + 3, k + 1, 0);
		world.setBlock(i + 3, j + 3, k + 2, 0);
		world.setBlock(i + 3, j + 3, k + 3, 0);
		world.setBlock(i + 3, j + 3, k + 4, 0);
		world.setBlock(i + 3, j + 3, k + 5, 0);
		world.setBlock(i + 3, j + 3, k + 6, 0);
		world.setBlock(i + 3, j + 3, k + 7, 0);
		world.setBlock(i + 3, j + 3, k + 8, 0);
		world.setBlock(i + 3, j + 4, k + 0, 0);
		world.setBlock(i + 3, j + 4, k + 1, 0);
		world.setBlock(i + 3, j + 4, k + 2, 0);
		world.setBlock(i + 3, j + 4, k + 3, 0);
		world.setBlock(i + 3, j + 4, k + 4, 0);
		world.setBlock(i + 3, j + 4, k + 5, 0);
		world.setBlock(i + 3, j + 4, k + 6, 0);
		world.setBlock(i + 3, j + 4, k + 7, 0);
		world.setBlock(i + 3, j + 4, k + 8, 0);
		world.setBlock(i + 3, j + 5, k + 0, 0);
		world.setBlock(i + 3, j + 5, k + 1, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 7, Block.glass.blockID);
		world.setBlock(i + 3, j + 5, k + 8, 0);
		world.setBlock(i + 4, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 0, k + 1, Block.grass.blockID);
		world.setBlock(i + 4, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 4, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 4, j + 0, k + 4, Block.dirt.blockID);
		world.setBlock(i + 4, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 4, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 4, j + 0, k + 7, Block.grass.blockID);
		world.setBlock(i + 4, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 0, 0);
		world.setBlock(i + 4, j + 1, k + 1, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 4, j + 1, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 4, j + 1, k + 7, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 4, j + 1, k + 8, 0);
		world.setBlock(i + 4, j + 2, k + 0, 0);
		world.setBlock(i + 4, j + 2, k + 1, 0);
		world.setBlock(i + 4, j + 2, k + 2, 0);
		world.setBlock(i + 4, j + 2, k + 3, 0);
		world.setBlock(i + 4, j + 2, k + 4, Block.cloth.blockID);
		world.setBlock(i + 4, j + 2, k + 5, 0);
		world.setBlock(i + 4, j + 2, k + 6, 0);
		world.setBlock(i + 4, j + 2, k + 7, 0);
		world.setBlock(i + 4, j + 2, k + 8, 0);
		world.setBlock(i + 4, j + 3, k + 0, 0);
		world.setBlock(i + 4, j + 3, k + 1, 0);
		world.setBlock(i + 4, j + 3, k + 2, 0);
		world.setBlock(i + 4, j + 3, k + 3, 0);
		world.setBlock(i + 4, j + 3, k + 4, Block.cloth.blockID);
		world.setBlock(i + 4, j + 3, k + 5, 0);
		world.setBlock(i + 4, j + 3, k + 6, 0);
		world.setBlock(i + 4, j + 3, k + 7, 0);
		world.setBlock(i + 4, j + 3, k + 8, 0);
		world.setBlock(i + 4, j + 4, k + 0, 0);
		world.setBlock(i + 4, j + 4, k + 1, 0);
		world.setBlock(i + 4, j + 4, k + 2, 0);
		world.setBlock(i + 4, j + 4, k + 3, 0);
		world.setBlock(i + 4, j + 4, k + 4, mod_slenderman.BlockSlenderSpawner.blockID);
		world.setBlock(i + 4, j + 4, k + 5, 0);
		world.setBlock(i + 4, j + 4, k + 6, 0);
		world.setBlock(i + 4, j + 4, k + 7, 0);
		world.setBlock(i + 4, j + 4, k + 8, 0);
		world.setBlock(i + 4, j + 5, k + 0, 0);
		world.setBlock(i + 4, j + 5, k + 1, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 7, Block.glass.blockID);
		world.setBlock(i + 4, j + 5, k + 8, 0);
		world.setBlock(i + 5, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 0, k + 1, Block.grass.blockID);
		world.setBlock(i + 5, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 5, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 5, j + 0, k + 4, Block.dirt.blockID);
		world.setBlock(i + 5, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 5, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 5, j + 0, k + 7, Block.grass.blockID);
		world.setBlock(i + 5, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 0, 0);
		world.setBlock(i + 5, j + 1, k + 1, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 5, j + 1, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 5, j + 1, k + 7, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 5, j + 1, k + 8, 0);
		world.setBlock(i + 5, j + 2, k + 0, 0);
		world.setBlock(i + 5, j + 2, k + 1, 0);
		world.setBlock(i + 5, j + 2, k + 2, 0);
		world.setBlock(i + 5, j + 2, k + 3, 0);
		world.setBlock(i + 5, j + 2, k + 5, 0);
		world.setBlock(i + 5, j + 2, k + 6, 0);
		world.setBlock(i + 5, j + 2, k + 7, 0);
		world.setBlock(i + 5, j + 2, k + 8, 0);
		world.setBlock(i + 5, j + 3, k + 0, 0);
		world.setBlock(i + 5, j + 3, k + 1, 0);
		world.setBlock(i + 5, j + 3, k + 2, 0);
		world.setBlock(i + 5, j + 3, k + 3, 0);
		world.setBlock(i + 5, j + 3, k + 4, 0);
		world.setBlock(i + 5, j + 3, k + 5, 0);
		world.setBlock(i + 5, j + 3, k + 6, 0);
		world.setBlock(i + 5, j + 3, k + 7, 0);
		world.setBlock(i + 5, j + 3, k + 8, 0);
		world.setBlock(i + 5, j + 4, k + 0, 0);
		world.setBlock(i + 5, j + 4, k + 1, 0);
		world.setBlock(i + 5, j + 4, k + 2, 0);
		world.setBlock(i + 5, j + 4, k + 3, 0);
		world.setBlock(i + 5, j + 4, k + 4, 0);
		world.setBlock(i + 5, j + 4, k + 5, 0);
		world.setBlock(i + 5, j + 4, k + 6, 0);
		world.setBlock(i + 5, j + 4, k + 7, 0);
		world.setBlock(i + 5, j + 4, k + 8, 0);
		world.setBlock(i + 5, j + 5, k + 0, 0);
		world.setBlock(i + 5, j + 5, k + 1, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 7, Block.glass.blockID);
		world.setBlock(i + 5, j + 5, k + 8, 0);
		world.setBlock(i + 6, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 0, k + 1, Block.grass.blockID);
		world.setBlock(i + 6, j + 0, k + 2, Block.dirt.blockID);
		world.setBlock(i + 6, j + 0, k + 3, Block.dirt.blockID);
		world.setBlock(i + 6, j + 0, k + 4, Block.dirt.blockID);
		world.setBlock(i + 6, j + 0, k + 6, Block.dirt.blockID);
		world.setBlock(i + 6, j + 0, k + 7, Block.grass.blockID);
		world.setBlock(i + 6, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 0, 0);
		world.setBlock(i + 6, j + 1, k + 1, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 6, j + 1, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 6, j + 1, k + 7, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 6, j + 1, k + 8, 0);
		world.setBlock(i + 6, j + 2, k + 0, 0);
		world.setBlock(i + 6, j + 2, k + 1, 0);
		world.setBlock(i + 6, j + 2, k + 3, 0);
		world.setBlock(i + 6, j + 2, k + 4, 0);
		world.setBlock(i + 6, j + 2, k + 5, 0);
		world.setBlock(i + 6, j + 2, k + 6, 0);
		world.setBlock(i + 6, j + 2, k + 7, 0);
		world.setBlock(i + 6, j + 2, k + 8, 0);
		world.setBlock(i + 6, j + 3, k + 0, 0);
		world.setBlock(i + 6, j + 3, k + 1, 0);
		world.setBlock(i + 6, j + 3, k + 2, 0);
		world.setBlock(i + 6, j + 3, k + 3, 0);
		world.setBlock(i + 6, j + 3, k + 4, 0);
		world.setBlock(i + 6, j + 3, k + 5, 0);
		world.setBlock(i + 6, j + 3, k + 6, 0);
		world.setBlock(i + 6, j + 3, k + 7, 0);
		world.setBlock(i + 6, j + 3, k + 8, 0);
		world.setBlock(i + 6, j + 4, k + 0, 0);
		world.setBlock(i + 6, j + 4, k + 1, 0);
		world.setBlock(i + 6, j + 4, k + 2, 0);
		world.setBlock(i + 6, j + 4, k + 3, 0);
		world.setBlock(i + 6, j + 4, k + 4, 0);
		world.setBlock(i + 6, j + 4, k + 5, 0);
		world.setBlock(i + 6, j + 4, k + 6, 0);
		world.setBlock(i + 6, j + 4, k + 7, 0);
		world.setBlock(i + 6, j + 4, k + 8, 0);
		world.setBlock(i + 6, j + 5, k + 0, 0);
		world.setBlock(i + 6, j + 5, k + 1, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 7, Block.glass.blockID);
		world.setBlock(i + 6, j + 5, k + 8, 0);
		world.setBlock(i + 7, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 7, j + 0, k + 1, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 2, Block.grass.blockID);
		world.setBlock(i + 7, j + 0, k + 3, Block.grass.blockID);
		world.setBlock(i + 7, j + 0, k + 4, Block.grass.blockID);
		world.setBlock(i + 7, j + 0, k + 5, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 6, Block.grass.blockID);
		world.setBlock(i + 7, j + 0, k + 7, Block.dirt.blockID);
		world.setBlock(i + 7, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 0, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 7, j + 1, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 1, k + 2, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 7, j + 1, k + 3, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 7, j + 1, k + 4, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 7, j + 1, k + 5, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 7, j + 1, k + 6, Block.stairsNetherQuartz.blockID);
		world.setBlock(i + 7, j + 1, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 1, k + 8, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 7, j + 2, k + 0, 0);
		world.setBlock(i + 7, j + 2, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 2, k + 2, 0);
		world.setBlock(i + 7, j + 2, k + 3, 0);
		world.setBlock(i + 7, j + 2, k + 4, 0);
		world.setBlock(i + 7, j + 2, k + 5, 0);
		world.setBlock(i + 7, j + 2, k + 6, 0);
		world.setBlock(i + 7, j + 2, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 2, k + 8, 0);
		world.setBlock(i + 7, j + 3, k + 0, 0);
		world.setBlock(i + 7, j + 3, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 3, k + 2, 0);
		world.setBlock(i + 7, j + 3, k + 3, 0);
		world.setBlock(i + 7, j + 3, k + 4, 0);
		world.setBlock(i + 7, j + 3, k + 5, 0);
		world.setBlock(i + 7, j + 3, k + 6, 0);
		world.setBlock(i + 7, j + 3, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 3, k + 8, 0);
		world.setBlock(i + 7, j + 4, k + 0, 0);
		world.setBlock(i + 7, j + 4, k + 1, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 4, k + 2, 0);
		world.setBlock(i + 7, j + 4, k + 3, 0);
		world.setBlock(i + 7, j + 4, k + 4, 0);
		world.setBlock(i + 7, j + 4, k + 5, 0);
		world.setBlock(i + 7, j + 4, k + 6, 0);
		world.setBlock(i + 7, j + 4, k + 7, Block.blockIron.blockID);
		world.setBlock(i + 7, j + 4, k + 8, 0);
		world.setBlock(i + 7, j + 5, k + 0, 0);
		world.setBlock(i + 7, j + 5, k + 1, Block.blockLapis.blockID);
		world.setBlock(i + 7, j + 5, k + 2, Block.glass.blockID);
		world.setBlock(i + 7, j + 5, k + 3, Block.glass.blockID);
		world.setBlock(i + 7, j + 5, k + 4, Block.glass.blockID);
		world.setBlock(i + 7, j + 5, k + 5, Block.glass.blockID);
		world.setBlock(i + 7, j + 5, k + 6, Block.glass.blockID);
		world.setBlock(i + 7, j + 5, k + 7, Block.blockLapis.blockID);
		world.setBlock(i + 7, j + 5, k + 8, 0);
		world.setBlock(i + 8, j + 0, k + 0, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 1, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 2, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 3, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 4, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 5, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 6, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 7, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 0, k + 8, Block.stoneBrick.blockID);
		world.setBlock(i + 8, j + 1, k + 0, 0);
		world.setBlock(i + 8, j + 1, k + 1, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 8, j + 1, k + 2, 0);
		world.setBlock(i + 8, j + 1, k + 3, 0);
		world.setBlock(i + 8, j + 1, k + 4, 0);
		world.setBlock(i + 8, j + 1, k + 5, 0);
		world.setBlock(i + 8, j + 1, k + 6, 0);
		world.setBlock(i + 8, j + 1, k + 7, Block.stairsStoneBrick.blockID);
		world.setBlock(i + 8, j + 1, k + 8, 0);
		world.setBlock(i + 8, j + 2, k + 0, 0);
		world.setBlock(i + 8, j + 2, k + 1, 0);
		world.setBlock(i + 8, j + 2, k + 2, 0);
		world.setBlock(i + 8, j + 2, k + 3, 0);
		world.setBlock(i + 8, j + 2, k + 4, 0);
		world.setBlock(i + 8, j + 2, k + 5, 0);
		world.setBlock(i + 8, j + 2, k + 6, 0);
		world.setBlock(i + 8, j + 2, k + 7, 0);
		world.setBlock(i + 8, j + 2, k + 8, 0);
		world.setBlock(i + 8, j + 3, k + 0, 0);
		world.setBlock(i + 8, j + 3, k + 1, 0);
		world.setBlock(i + 8, j + 3, k + 2, 0);
		world.setBlock(i + 8, j + 3, k + 3, 0);
		world.setBlock(i + 8, j + 3, k + 4, 0);
		world.setBlock(i + 8, j + 3, k + 5, 0);
		world.setBlock(i + 8, j + 3, k + 6, 0);
		world.setBlock(i + 8, j + 3, k + 7, 0);
		world.setBlock(i + 8, j + 3, k + 8, 0);
		world.setBlock(i + 8, j + 4, k + 0, 0);
		world.setBlock(i + 8, j + 4, k + 1, 0);
		world.setBlock(i + 8, j + 4, k + 2, 0);
		world.setBlock(i + 8, j + 4, k + 3, 0);
		world.setBlock(i + 8, j + 4, k + 4, 0);
		world.setBlock(i + 8, j + 4, k + 5, 0);
		world.setBlock(i + 8, j + 4, k + 6, 0);
		world.setBlock(i + 8, j + 4, k + 7, 0);
		world.setBlock(i + 8, j + 4, k + 8, 0);
		world.setBlock(i + 8, j + 5, k + 0, 0);
		world.setBlock(i + 8, j + 5, k + 1, 0);
		world.setBlock(i + 8, j + 5, k + 2, 0);
		world.setBlock(i + 8, j + 5, k + 3, 0);
		world.setBlock(i + 8, j + 5, k + 4, 0);
		world.setBlock(i + 8, j + 5, k + 5, 0);
		world.setBlock(i + 8, j + 5, k + 6, 0);
		world.setBlock(i + 8, j + 5, k + 7, 0);
		world.setBlock(i + 8, j + 5, k + 8, 0);
		world.setBlock(i + 2, j + 2, k + 3, Block.redstoneWire.blockID);
		world.setBlock(i + 3, j + 2, k + 6, Block.redstoneWire.blockID);
		world.setBlock(i + 5, j + 2, k + 4, Block.redstoneWire.blockID);
		world.setBlock(i + 6, j + 2, k + 2, Block.redstoneWire.blockID);

		return true;
	}
}