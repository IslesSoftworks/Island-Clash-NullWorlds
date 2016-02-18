package io.isles.ic.nullworlds;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Arrays;
import java.util.Random;

/**
 * Represents a null chunk generator. This will make it so newly generated chunks do not create blocks.
 *
 * Code forked from NullTerrain. https://github.com/Elizacat/NullTerrain
 */
public class NullChunkGenerator extends ChunkGenerator {

    @Override
    public byte[] generate(World world, Random random, int cx, int cz) {
        return new byte[65536];
    }

    @Override
    public Location getFixedSpawnLocation(World world, Random random) {
        // Sane default --Elizabeth
        return new Location(world, 0, 64, 0);
    }

}