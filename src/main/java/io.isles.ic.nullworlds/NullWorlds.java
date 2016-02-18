package io.isles.ic.nullworlds;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

/** A {@link JavaPlugin} exposing the {@link NullChunkGenerator}. */
public final class NullWorlds extends JavaPlugin {

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new NullChunkGenerator();
    }

}