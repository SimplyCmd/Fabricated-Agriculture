package simplycmd.fabricated_agriculture;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import simplycmd.fabricated_agriculture.fish.Fish;

public class Entities {
    public static void register() {
        Fish.server();
    }

    public static void registerClient() {
        Fish.client();
    }

    public static EntityModelLayer regLayer(String id) {
        return new EntityModelLayer(new Identifier(Main.MOD_ID, id), "main");
    }
}
