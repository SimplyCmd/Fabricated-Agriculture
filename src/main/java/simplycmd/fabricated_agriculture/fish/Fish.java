package simplycmd.fabricated_agriculture.fish;

import io.github.simplycmd.featherlib.registry.ID;
import simplycmd.fabricated_agriculture.Main;
import simplycmd.fabricated_agriculture.fish.islehoppers.IslehopperEntity;
import simplycmd.fabricated_agriculture.fish.islehoppers.IslehopperEntityModel;
import simplycmd.fabricated_agriculture.fish.islehoppers.IslehopperEntityRenderer;
import simplycmd.fabricated_agriculture.fish.pondies.PondieEntity;
import simplycmd.fabricated_agriculture.fish.pondies.PondieEntityModel;
import simplycmd.fabricated_agriculture.fish.pondies.PondieEntityRenderer;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntity;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntityModel;
import simplycmd.fabricated_agriculture.fish.splashtails.SplashtailEntityRenderer;

public class Fish {

    public static final FishRegister<SplashtailEntity> RUBY_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("ruby_splashtail"), (type, world) -> new SplashtailEntity("ruby", type, world));
    public static final FishRegister<SplashtailEntity> SUNNY_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("sunny_splashtail"), (type, world) -> new SplashtailEntity("sunny", type, world));
    public static final FishRegister<SplashtailEntity> INDIGO_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("indigo_splashtail"), (type, world) -> new SplashtailEntity("indigo", type, world));
    public static final FishRegister<SplashtailEntity> UMBER_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("umber_splashtail"), (type, world) -> new SplashtailEntity("umber", type, world));
    public static final FishRegister<SplashtailEntity> SEAFOAM_SPLASHTAIL = new FishRegister<SplashtailEntity>(ID("seafoam_splashtail"), (type, world) -> new SplashtailEntity("seafoam", type, world));

    public static final FishRegister<PondieEntity> CHARCOAL_PONDIE = new FishRegister<PondieEntity>(ID("charcoal_pondie"), (type, world) -> new PondieEntity("charcoal", type, world));
    public static final FishRegister<PondieEntity> ORCHID_PONDIE = new FishRegister<PondieEntity>(ID("orchid_pondie"), (type, world) -> new PondieEntity("orchid", type, world));
    public static final FishRegister<PondieEntity> BRONZE_PONDIE = new FishRegister<PondieEntity>(ID("bronze_pondie"), (type, world) -> new PondieEntity("bronze", type, world));
    public static final FishRegister<PondieEntity> BRIGHT_PONDIE = new FishRegister<PondieEntity>(ID("bright_pondie"), (type, world) -> new PondieEntity("bright", type, world));
    public static final FishRegister<PondieEntity> MOONSKY_PONDIE = new FishRegister<PondieEntity>(ID("moonsky_pondie"), (type, world) -> new PondieEntity("moonsky", type, world));

    public static final FishRegister<IslehopperEntity> STONE_ISLEHOPPER = new FishRegister<IslehopperEntity>(ID("stone_islehopper"), (type, world) -> new IslehopperEntity("stone", type, world));
    public static final FishRegister<IslehopperEntity> MOSS_ISLEHOPPER = new FishRegister<IslehopperEntity>(ID("moss_islehopper"), (type, world) -> new IslehopperEntity("moss", type, world));
    public static final FishRegister<IslehopperEntity> HONEY_ISLEHOPPER = new FishRegister<IslehopperEntity>(ID("honey_islehopper"), (type, world) -> new IslehopperEntity("honey", type, world));
    public static final FishRegister<IslehopperEntity> RAVEN_ISLEHOPPER = new FishRegister<IslehopperEntity>(ID("raven_islehopper"), (type, world) -> new IslehopperEntity("raven", type, world));
    public static final FishRegister<IslehopperEntity> AMETHYST_ISLEHOPPER = new FishRegister<IslehopperEntity>(ID("amethyst_islehopper"), (type, world) -> new IslehopperEntity("amethyst", type, world));

    public static void server() {
        RUBY_SPLASHTAIL.server();
        SUNNY_SPLASHTAIL.server();
        INDIGO_SPLASHTAIL.server();
        UMBER_SPLASHTAIL.server();
        SEAFOAM_SPLASHTAIL.server();

        CHARCOAL_PONDIE.server();
        ORCHID_PONDIE.server();
        BRONZE_PONDIE.server();
        BRIGHT_PONDIE.server();
        MOONSKY_PONDIE.server();

        STONE_ISLEHOPPER.server();
        MOSS_ISLEHOPPER.server();
        HONEY_ISLEHOPPER.server();
        RAVEN_ISLEHOPPER.server();
        AMETHYST_ISLEHOPPER.server();
    }

    public static void client() {
        splashtailClient(RUBY_SPLASHTAIL);
        splashtailClient(SUNNY_SPLASHTAIL);
        splashtailClient(INDIGO_SPLASHTAIL);
        splashtailClient(UMBER_SPLASHTAIL);
        splashtailClient(SEAFOAM_SPLASHTAIL);

        pondieClient(CHARCOAL_PONDIE);
        pondieClient(ORCHID_PONDIE);
        pondieClient(BRONZE_PONDIE);
        pondieClient(BRIGHT_PONDIE);
        pondieClient(MOONSKY_PONDIE);

        islehopperClient(STONE_ISLEHOPPER);
        islehopperClient(MOSS_ISLEHOPPER);
        islehopperClient(HONEY_ISLEHOPPER);
        islehopperClient(RAVEN_ISLEHOPPER);
        islehopperClient(AMETHYST_ISLEHOPPER);
    }

    private static void splashtailClient(FishRegister<SplashtailEntity> fish) {
        fish.client((context) -> new SplashtailEntityRenderer(fish, context), SplashtailEntityModel::getTexturedModelData);
    }
    private static void pondieClient(FishRegister<PondieEntity> fish) {
        fish.client((context) -> new PondieEntityRenderer(fish, context), PondieEntityModel::getTexturedModelData);
    }
    private static void islehopperClient(FishRegister<IslehopperEntity> fish) {
        fish.client((context) -> new IslehopperEntityRenderer(fish, context), IslehopperEntityModel::getTexturedModelData);
    }

    private static ID ID(String id) {
        return new ID(Main.MOD_ID, id);
    }
}