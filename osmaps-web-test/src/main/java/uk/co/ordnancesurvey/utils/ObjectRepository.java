package uk.co.ordnancesurvey.utils;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectRepository {
	
		 
	

	
	@FindBy(how = How.XPATH, using = ".//*[@id='Window_1_Btn_Mode_Route']")
	public WebElement routes;

	// public final String routes= ".//*[@id='Window_1_Btn_Mode_Route']";
	public final String groups = ".//*[@id='Window_1_Btn_Mode_Group']";
	public final String mapfeatures = ".//*[@id='main-top-bar-places']";
	// public final String MapFeatures=".//*[@id='Window_1_Btn_Mode_POI']";
	public final String mapStackButton=".//*[@id='layer_menu']";
	
	
//Search box object
	public final String searchBox=".//*[@id='main-top-bar-search-input']";
	public final String searchBoxPopUpClose="//div[contains(@class,'Close_Btn')]/img[@src='bundles/osapp/images/close_window.png']";
	public final String SearchBoxPopUp="//div[contains(@class,'PopUp_Canvas')]";
	// Routes sub menu
	public final String planRoute = ".//*[@id='Window_1_Btn_Plan']";
	public final String createRoute = ".//*[@id='Window_1_Btn_Create']";

	@FindBy(how = How.XPATH, using = ".//*[@id='Window_1_Btn_Discover']")	
	public WebElement discoverRoute;
	
		

	// Register Page Objects
	
	public final String register="//div[@id='Window_1_RE_BTN']";	

	public final String  reg_firstName="//input[@id='registerFormName']";
	
	public final String  reg_lastName=".//*[@id='register-form-surname']";	

	public final String  reg_emailAddress=".//*[@id='register-form-email']";	
	
	public final String reg_password=".//*[@id='register-form-password']";	

	public final String  reg_confirmpassword=".//*[@id='register-form-password-repeat']";	
	
	public final String reg_nickName=".//*[@id='register-form-nickname']";	
	
	public final String reg_subButton=".//*[@id='register-form-register-button']";
	
	// Subscriber Page Objects

	
	
	// Login page objects

	public final String Settings = ".//*[@id='Window_1_SettingsText']";
	public final String settings_Login = ".//*[@id='SettingsLogin']";
	public final String login_email = ".//*[@id='login-form-email']";
	public final String login_email_address = "//input[@id='login-form-email']";
	public final String login_pwd = "//input[@id='login-form-password']";
	public final String login_button = "//div[contains(@class,'button center login-form-login-button margin-top-big')]";
	public final String close_login = "//div[contains(@class,'button-x')]";
	
	
	

	public final String ZoomIn = ".//*[@id='zoom-slider-plus']";
	public final String ZoomOut = ".//*[@id='zoom-slider-minus']";

	// Routes Tab Elements on the Web Page ******************
	public final String RoutesTab = ".//*[@id='main-top-bar-routes']";
	public final String Route_list=".//*[@id='discoveredRoutesList']/div[1]";
	
	
	public final String ab_Directionstab = ".//*[@id='MyRouteAB']";
	public final String ab_startLocation=".//*[@id='routeABSearchInput0']";
	public final String ab_finishLocation=".//*[@id='routeABSearchInput1']";
	public final String ab_getDirectionBttn=".//*[@id='routeABGetBtn']";
	public final String ab_carIcon=".//*[@id='routeABTypeDrive']";
	public final String ab_walkIcon="//img[@id='routeABTypeWalk']";
	public final String ab_resultPopup="//div[@class='AB_PopUp_Details']";
	//public final String ab_walk_resultPopup="";
	
	
	public final String RoutesTab_MyRoutes = ".//*[@id='MyRouteMy']|";

	// Elements for the Routes Tab -Create CustomRoute Trail
	
	public final String RoutesTab_CreateCustomRouteTrial = ".//*[@id='MyRouteCreate']";
	
	public final String CustomRoute_Save = ".//*[@id='createRouteSave']";
	public final String CustomRoute_Cancel = ".//*[@id='createRouteDelete']";
	public final String CustomRoute_Undo = ".//*[@id='createRouteUndo']";
	public final String CustomrRoute_Edit=".//*[@id='Window_1_Content']/div[16]/div[1]/div[2]";

	public final String CustomRoute_RouteName = ".//*[@id='saveRouteNameInput']";
	public final String CustomRoute_RouteNotes = ".//*[@id='saveRouteNoteInput']";
	public final String CustomRoute_RouteSave = ".//*[@id='saveRouteBtn']";
	public final String CustomRoute_Type_Walking = ".//*[@id='btn_activity_walking']";
	public final String CustomRoute_Type_Running = ".//*[@id='btn_activity_running']";
	public final String CustomRoute_Type_Cycling = ".//*[@id='btn_activity_cycling']";
	public final String CustomRoute_Type_Other = ".//*[@id='btn_activity_other']";
	public final String CustomerRoute_RadioBtn_View_OnlyMe = ".//*[@id='btn_view_me']";
	public final String CustomerRoute_RadioBtn_View_Everyone = ".//*[@id='btn_view_everyone']";
	public final String delete_routeDlgButton=".Basic_Btn.dialogButton";
    public final String delete_OkButton=".//*[@id='Window_1_Content']/div[19]/div/div[2]/div";
	// Elements for Routes Tab Discover Route:
	public final String RoutesTab_DiscoverRoutes = ".//*[@id='MyRouteDiscover']";
	
	// Directions Tab
	
	public final String DirectionsTab=".//*[@id='main-top-bar-directions']";
	
	public final String DiscoverRoutes_routlist = ".//*[@id='discoveredRoutesList']/div";
	public final String DiscoverRoutes_routeType_Run = ".//*[@id='discSelectRouteTypeRun']";
	public final String DiscoverRoutes_routeType_Walk = ".//*[@id='discSelectRouteTypeWalk']";
	public final String DiscoverRoutes_routeType_Cycle = ".//*[@id='discSelectRouteTypeCycle']";
	public final String DiscoverRoutes_routeType_Other = ".//*[@id='discSelectRouteTypeOther']";
	public final String DiscoverRoutes_routeType_All = ".//*[@id='discSelectRouteTypeAll']";
	public final String DiscoverRoutes_routeFiler_Distance_List = ".//*[@id='discSelectDistance']/option";
	public final String DiscoverRoutes_route_List_FirstRoute = ".//*[@id='discoveredRoutesList']/div[1]/div[1]/div[2]";
	public final String DiscoverRoutes_route_List_FirstRoute_ViewLink = ".//*[@id='discoveredRoutesList']/div[1]/div[1]/div[2]";
	public final String DiscoverRoutes_route_POI_RouteName = ".//*[@id='discPopupContent']/div[2]/div/b";

	// 1:25 and 1:50 maps
	public final String map125 = "html/body/div[2]/div[2]/div[11]/div/ul/li[4]/div";
	public final String map150 = "html/body/div[2]/div[2]/div[11]/div/ul/li[3]/div";
	public final String zoomMap="html/body/div[2]/div[2]/div[11]/div/ul/li[1]/div";
	public final String AerialMap="html/body/div[2]/div[2]/div[11]/div/ul/li[2]/div";
	
	
	//Elements for POI

	public final String poi_CategoryList = ".//div[contains(@class,'POI_Category_Parent')]/div[1]";
	public final String poi_Attractions = "//div[contains(@class,'POI_Category_Child_Name')][text()='Castles and historic houses']";
	public final String poi_AttractionsSlide = ".//*[@class='POI_Category_Parent'][2]/div/img[2]";
	public final String poi_CastlesAndAttractions = "//div[contains(@class,'POI_Category_Child_Name')][text()='Castles and historic houses']";
	public final String poi_Closebutton = ".//*[@id='Window_1_Btn_Mode_POI']";

	public final String poi_window = ".//*[@id='Window_1_Btn_Mode_POI' and @class='Basic_Btn Basic_Btn_Selected']/div";
	public final String poi_Information_Window = ".//*[@id='Window_1_Content']/div[11]/div[1]/div/div[3]";
	// Route list window Objects
	
	//Star Rating object
	
	public final String star_rating_pop_up = ".//*[@id='discPopupContent']/div[1]";
	public final String star_rating_discover_routes = ".//*[@id='discoveredRoutesList']/div[1]/div[1]/div[1]";
	
	
	// Turn on Live Map
	
	public final String Live_Map = ".//*[@id='liveMapSlider']";
	
	//Turn on weather
	
	public final String Turn_On_Weather = ".//*[@id='Window_1_Content']/div[15]/div/div[1]/div[3]/div[3]/div";
	
	//Select forecast days
	
	public final String Select_Weather_Forecast_day_1 = ".//*[@id='day1Btn']";
	public final String Select_Weather_Forecast_day_2 = ".//*[@id='day2Btn']";
	public final String Select_Weather_Forecast_day_3 = ".//*[@id='day3Btn']";
	public final String Select_Weather_Forecast_day_4 = ".//*[@id='day4Btn']";
	
	//Close Weather panel
	
	public final String Close_Weather_Panel = "//div[contains(@class,'Basic_Btn Allow_Select sidePaneClose')][text()='Close']";
	
	//Attraction
	public final String Attractions = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[2]/img[1]";
	//Adventure & Theme Parks
	public final String Adventure_Theme_Parks = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[1]";
	//Brewery
	public final String Brewery_Distillery_Vineyard = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[2]/div";
	//Castles
	public final String Castles_And_Historic_Houses = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[3]/div";
	//Countryside
	public final String Countryside = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[4]/div";
	//History
	public final String History = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[5]/div";
	//Museums
	public final String Museums = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[6]/div";
	//Parks & Gardens
	public final String Parks_And_Gardens= ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[7]/div";
	//Shopping
	public final String Shopping = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[8]/div";
	//Tours
	public final String Tours = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[4]/div[3]/div[9]/div";
	//Eating & Drinking
	public final String Eating_And_Drinking = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[5]/div[2]/img[1]";
	//Picnic Site
	public final String Picnic_Site = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[5]/div[3]/div[1]/div";
	//Pub
	public final String Pub = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[5]/div[3]/div[2]/div";
	//Restaurant
	public final String Restuarant = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[5]/div[3]/div[3]/div";
	//Tea/Coffee
	public final String Coffee_Shop = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[5]/div[3]/div[4]/div";
	
	
	//Close Map Features Panel
	
	public final String Close_Map_Features_Panel = ".//*[@id='Window_1_Content']/div[13]/div/div[1]/div[1]";
	
	//ROUTES TAB
	public final String Routes_Tab = ".//*[@id='Window_1_Btn_Mode_Route']";
	
	//Close
	public final String Routes_Tab_Close_Button = ".//*[@id='Window_1_Content']/div[15]/div/div[1]/div[1]";
	//Discover Routes
	public final String Discover_Routes = ".//*[@id='MyRouteDiscover']";
	//Create Custom Trail
	public final String Create_Custom_Trail = ".//*[@id='MyRouteCreate']";
	//My Routes
	public final String My_Routes = ".//*[@id='MyRouteMy']";
	//Get Directions
	public final String Get_Directions = ".//*[@id='main-top-bar-directions']";
	//Import GPX 	
	public final String ImportGPX=".//*[@id='MyRouteImport']";
	
	//Close Discover Routes Panel
	public final String Close_Discover_Routes_Panel = ".//*[@id='Window_1_Content']/div[15]/div[1]/div[1]/div[1]";
	
	//Close Create Custom Trail Panel
	public final String Close_Create_Custom_Trail_Panel = ".//*[@id='Window_1_Content']/div[16]/div[1]/div[1]/div[1]";
	
	//Close My Routes Panel
	public final String Close_My_Routes_Panel = ".//*[@id='Window_1_Content']/div[15]/div[1]/div[1]/div[1]";
	
	//Close A-B Panel
	public final String Close_AB_Panel = ".//*[@id='Window_1_Content']/div[16]/div[1]/div[1]/div[1]";
	
	//Close Get Directions Panel
	public final String Close_Get_Directions_Panel = ".//*[@id='Window_1_Content']/div[15]/div/div[1]/div[1]";
	
	//Sign up for paid subscription via upsell message
	
	//Close Get Directions Panel
	public final String Sign_up_for_paid_subscription = ".//*[@id='Window_1_Login_Header']/div[4]";
	

}
