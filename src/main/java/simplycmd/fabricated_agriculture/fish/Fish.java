package simplycmd.fabricated_agriculture.fish;

import io.github.simplycmd.featherlib.registry.ID;
import simplycmd.fabricated_agriculture.Main;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntity;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntityModel;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntityRenderer;

public class Fish {

    public static final FishRegister<SplashtailEntity> RUBY_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("ruby_splashtail"), (type, world) -> new SplashtailEntity("ruby", type, world));
    public static final FishRegister<SplashtailEntity> SUNNY_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("sunny_splashtail"), (type, world) -> new SplashtailEntity("sunny", type, world));
    public static final FishRegister<SplashtailEntity> INDIGO_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("indigo_splashtail"), (type, world) -> new SplashtailEntity("indigo", type, world));
    public static final FishRegister<SplashtailEntity> UMBER_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("umber_splashtail"), (type, world) -> new SplashtailEntity("umber", type, world));
    public static final FishRegister<SplashtailEntity> SEAFOAM_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("seafoam_splashtail"), (type, world) -> new SplashtailEntity("seafoam", type, world));

    public static void server() {
        RUBY_SPLASHTAIL.server();
        SUNNY_SPLASHTAIL.server();
        INDIGO_SPLASHTAIL.server();
        UMBER_SPLASHTAIL.server();
        SEAFOAM_SPLASHTAIL.server();
    }

    public static void client() {
        splashtailClient(RUBY_SPLASHTAIL);
        splashtailClient(SUNNY_SPLASHTAIL);
        splashtailClient(INDIGO_SPLASHTAIL);
        splashtailClient(UMBER_SPLASHTAIL);
        splashtailClient(SEAFOAM_SPLASHTAIL);
    }

    private static void splashtailClient(FishRegister<SplashtailEntity> fish) {
        fish.client((context) -> new SplashtailEntityRenderer(fish, context), SplashtailEntityModel::getTexturedModelData);
    }

    private static ID ID(String id) {
        return new ID(Main.MOD_ID, id);
    }
}