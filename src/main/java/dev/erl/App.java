package dev.erl;

import dev.erl.app.RootLoader;
import dev.erl.data.MemberDAO;
import dev.erl.data.OfficeDAO;
import dev.sol.core.application.FXApplication;
import dev.sol.core.application.loader.FXLoaderFactory;
import dev.sol.core.registry.FXCollectionsRegister;
import dev.sol.core.registry.FXControllerRegister;
import dev.sol.core.registry.FXNodeRegister;
import dev.sol.core.scene.FXSkin;
import dev.sol.db.DBService;
import javafx.collections.FXCollections;

/**
 * JavaFX App
 */
public class App extends FXApplication {

    public static final FXControllerRegister CONTROLLER_REGISTER = FXControllerRegister.INSTANCE;
    public static final FXCollectionsRegister COLLECTIONS_REGISTER = FXCollectionsRegister.INSTANCE;
    public static final FXNodeRegister NODE_REGISTER = FXNodeRegister.INSTANCE;

    public static final DBService DB_COOP = DBService.INSTANCE
            .initialize("jdbc:mysql://Localhost/coop_db_exercise?user=root&password=");

    @Override
    public void initialize() throws Exception {
       setTitle("COOP Management");
       setSkin(FXSkin.DRACULA);


       _initialize_dataset();
       _initialize_application();
    }
    private void _initialize_dataset(){
        COLLECTIONS_REGISTER.register("MEMBER", FXCollections.observableArrayList(MemberDAO.getMemberList()));

        COLLECTIONS_REGISTER.register("OFFICE", FXCollections.observableList(OfficeDAO.getOfficeList()));
    }
    private void _initialize_application() {
        RootLoader rootLoader = (RootLoader) FXLoaderFactory.createInstance(
                RootLoader.class,
                App.class.getResource("/dev/erl/app/ROOT.fxml"))
                .addParameter("scene", applicationScene)
                .initialize();
        rootLoader.load();

    }

}