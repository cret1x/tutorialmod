package com.cretix.tutorialmod.sound;

import com.cretix.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent METAL_DETECTOR_FOUND_ORE = registerSoundEvent("metal_detector_found_ore");

    public static final SoundEvent SOUND_BLOCK_BREAK = registerSoundEvent("sound_block_break");
    public static final SoundEvent SOUND_BLOCK_STEP = registerSoundEvent("sound_block_step");
    public static final SoundEvent SOUND_BLOCK_PLACE = registerSoundEvent("sound_block_place");
    public static final SoundEvent SOUND_BLOCK_HIT = registerSoundEvent("sound_block_hit");
    public static final SoundEvent SOUND_BLOCK_FALL = registerSoundEvent("sound_block_fall");

    public static final SoundEvent MOD_MUSIC_DISC_1 = registerSoundEvent("mod_music_disc_1");
    public static final SoundEvent MOD_MUSIC_DISC_2 = registerSoundEvent("mod_music_disc_2");
    public static final SoundEvent MOD_MUSIC_DISC_3 = registerSoundEvent("mod_music_disc_3");
    public static final SoundEvent MOD_MUSIC_DISC_4 = registerSoundEvent("mod_music_disc_4");
    public static final SoundEvent MOD_MUSIC_DISC_5 = registerSoundEvent("mod_music_disc_5");
    public static final SoundEvent MOD_MUSIC_DISC_6 = registerSoundEvent("mod_music_disc_6");
    public static final SoundEvent MOD_MUSIC_DISC_7 = registerSoundEvent("mod_music_disc_7");
    public static final SoundEvent MOD_MUSIC_DISC_8 = registerSoundEvent("mod_music_disc_8");
    public static final SoundEvent MOD_MUSIC_DISC_9 = registerSoundEvent("mod_music_disc_9");
    public static final SoundEvent MOD_MUSIC_DISC_10 = registerSoundEvent("mod_music_disc_10");
    public static final SoundEvent MOD_MUSIC_DISC_11 = registerSoundEvent("mod_music_disc_11");

    public static final BlockSoundGroup SOUND_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.SOUND_BLOCK_BREAK, ModSounds.SOUND_BLOCK_STEP, ModSounds.SOUND_BLOCK_PLACE,
            ModSounds.SOUND_BLOCK_HIT, ModSounds.SOUND_BLOCK_FALL);

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {

    }
}
