package com.github.unchama.gui;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

import com.github.unchama.gui.admin.AdminTypeMenuManager;
import com.github.unchama.gui.admin.build.AdminBuildMenuManager;
import com.github.unchama.gui.admin.customhead.AdminCustomHeadGiveMenuManager;
import com.github.unchama.gui.admin.customhead.AdminCustomHeadMainMenuManager;
import com.github.unchama.gui.admin.gacha.AdminGachaTypeMenuManager;
import com.github.unchama.gui.admin.gacha.gigantic.AG_AppleGachaMenuManager;
import com.github.unchama.gui.admin.gacha.gigantic.AG_EditGachaMenuManager;
import com.github.unchama.gui.admin.gacha.gigantic.AG_ListGachaMenuManager;
import com.github.unchama.gui.admin.gacha.gigantic.AG_TicketGachaMenuManager;
import com.github.unchama.gui.admin.gacha.gigantic.AdminGiganticGachaMenuManager;
import com.github.unchama.gui.admin.gacha.old.AdminOldAppleGachaMenuManager;
import com.github.unchama.gui.admin.gacha.old.AdminOldEditGachaMenuManager;
import com.github.unchama.gui.admin.gacha.old.AdminOldGachaMenuManager;
import com.github.unchama.gui.admin.gacha.old.AdminOldListGachaMenuManager;
import com.github.unchama.gui.admin.gacha.old.AdminOldTicketGachaMenuManager;
import com.github.unchama.gui.admin.gacha.premium.AP_AppleGachaMenuManager;
import com.github.unchama.gui.admin.gacha.premium.AP_EditGachaMenuManager;
import com.github.unchama.gui.admin.gacha.premium.AP_ListGachaMenuManager;
import com.github.unchama.gui.admin.gacha.premium.AP_TicketGachaMenuManager;
import com.github.unchama.gui.admin.gacha.premium.AdminPremiumGachaMenuManager;
import com.github.unchama.gui.admin.toolrepair.AdminToolRepairMenuManager;
import com.github.unchama.gui.build.BlockCraftMenuManagerFirstPage;
import com.github.unchama.gui.build.BlockCraftMenuManagerSecondPage;
import com.github.unchama.gui.build.BlockCraftMenuManagerThirdPage;
import com.github.unchama.gui.build.BuildMenuManager;
import com.github.unchama.gui.buildskill.BlockLineUpMenuManager;
import com.github.unchama.gui.buildskill.ZoneSkillDataMenuManager;
import com.github.unchama.gui.donate.DonateHistoryMenuManager;
import com.github.unchama.gui.exchanger.ExchangerMenuManager;
import com.github.unchama.gui.fishing.FishingMainMenuManager;
import com.github.unchama.gui.gachastack.GachaStackCategoryMenuManager;
import com.github.unchama.gui.gachastack.GachaStackMainMenuManager;
import com.github.unchama.gui.huntingpoint.HuntingPointMainMenuManager;
import com.github.unchama.gui.huntingpoint.HuntingPointShopMenuManager;
import com.github.unchama.gui.minestack.StackCategoryMenuManager;
import com.github.unchama.gui.minestack.build.CategoryBuildMenuManager;
import com.github.unchama.gui.minestack.item.CategoryItemMenuManager;
import com.github.unchama.gui.minestack.material.CategoryMaterialMenuManager;
import com.github.unchama.gui.minestack.otherwise.CategoryOtherwiseMenuManager;
import com.github.unchama.gui.minestack.redstone.CategoryRedstoneMenuManager;
import com.github.unchama.gui.moduler.GuiMenuManager;
import com.github.unchama.gui.presentbox.PresentBoxMenuManager;
import com.github.unchama.gui.ranking.RankingMenuManager;
import com.github.unchama.gui.ranking.RankingSelectMenuManager;
import com.github.unchama.gui.ranking.build.DayBuildRankingMenuManager;
import com.github.unchama.gui.ranking.build.MonthBuildRankingMenuManager;
import com.github.unchama.gui.ranking.build.TotalBuildRankingMenuManager;
import com.github.unchama.gui.ranking.build.WeekBuildRankingMenuManager;
import com.github.unchama.gui.ranking.build.YearBuildRankingMenuManager;
import com.github.unchama.gui.ranking.fishing.DayFishingExpRankingMenuManager;
import com.github.unchama.gui.ranking.fishing.MonthFishingExpRankingMenuManager;
import com.github.unchama.gui.ranking.fishing.TotalFishingExpRankingMenuManager;
import com.github.unchama.gui.ranking.fishing.WeekFishingExpRankingMenuManager;
import com.github.unchama.gui.ranking.fishing.YearFishingExpRankingMenuManager;
import com.github.unchama.gui.ranking.huntingexp.DayHuntingExpRankingMenuManager;
import com.github.unchama.gui.ranking.huntingexp.MonthHuntingExpRankingMenuManager;
import com.github.unchama.gui.ranking.huntingexp.TotalHuntingExpRankingMenuManager;
import com.github.unchama.gui.ranking.huntingexp.WeekHuntingExpRankingMenuManager;
import com.github.unchama.gui.ranking.huntingexp.YearHuntingExpRankingMenuManager;
import com.github.unchama.gui.ranking.logintime.DayLoginTimeRankingMenuManager;
import com.github.unchama.gui.ranking.logintime.MonthLoginTimeRankingMenuManager;
import com.github.unchama.gui.ranking.logintime.TotalLoginTimeRankingMenuManager;
import com.github.unchama.gui.ranking.logintime.WeekLoginTimeRankingMenuManager;
import com.github.unchama.gui.ranking.logintime.YearLoginTimeRankingMenuManager;
import com.github.unchama.gui.ranking.mineblock.DayMineBlockRankingMenuManager;
import com.github.unchama.gui.ranking.mineblock.MonthMineBlockRankingMenuManager;
import com.github.unchama.gui.ranking.mineblock.TotalMineBlockRankingMenuManager;
import com.github.unchama.gui.ranking.mineblock.WeekMineBlockRankingMenuManager;
import com.github.unchama.gui.ranking.mineblock.YearMineBlockRankingMenuManager;
import com.github.unchama.gui.seichireward.SeichiRewardMenuManager;
import com.github.unchama.gui.seichiskill.active.ActiveSkillToggleMenuManager;
import com.github.unchama.gui.seichiskill.active.ActiveSkillTypeMenuManager;
import com.github.unchama.gui.seichiskill.active.condensation.C_OriginMenuManager;
import com.github.unchama.gui.seichiskill.active.condensation.C_RangeMenuManager;
import com.github.unchama.gui.seichiskill.active.condensation.CondensationMenuManager;
import com.github.unchama.gui.seichiskill.active.explosion.E_EffectSellectMenu;
import com.github.unchama.gui.seichiskill.active.explosion.E_RangeMenuManager;
import com.github.unchama.gui.seichiskill.active.explosion.ExplosionMenuManager;
import com.github.unchama.gui.seichiskill.active.fairyaegis.F_RangeMenuManager;
import com.github.unchama.gui.seichiskill.active.fairyaegis.FairyAegisMenuManager;
import com.github.unchama.gui.seichiskill.active.magicdrive.MD_RangeMenuManager;
import com.github.unchama.gui.seichiskill.active.magicdrive.MagicDriveMenuManager;
import com.github.unchama.gui.seichiskill.active.ruinfield.R_OriginMenuManager;
import com.github.unchama.gui.seichiskill.active.ruinfield.R_RangeMenuManager;
import com.github.unchama.gui.seichiskill.active.ruinfield.RuinFieldMenuManager;
import com.github.unchama.gui.seichiskill.passive.PassiveSkillTypeMenuManager;
import com.github.unchama.gui.settings.PlayerSettingsMenuManager;


/**
 * @author tar0ss
 *
 */
public final class GuiMenu {
	public static enum ManagerType {
		MAINMENU(MainMenuManager.class),
		PLAYERSETTINGSMENU(PlayerSettingsMenuManager.class),
		ADMINTYPEMENU(AdminTypeMenuManager.class),
		ADMINGACHATYPEMENU(AdminGachaTypeMenuManager.class),
		ADMINGIGANTICGACHAMENU(AdminGiganticGachaMenuManager.class),
		ADMINCUSTOMHEADMAINMENU(AdminCustomHeadMainMenuManager.class),
		ADMINCUSTOMHEADGIBEMENU(AdminCustomHeadGiveMenuManager.class),
		ADMINPREMIUMGACHAMENU(AdminPremiumGachaMenuManager.class),
		ADMINTOOLREPAIRMENU(AdminToolRepairMenuManager.class),
        ADMINBUILDMENU(AdminBuildMenuManager.class),
        ADMINOLDGACHAMENU(AdminOldGachaMenuManager.class),
		AG_LISTGACHAMENU(AG_ListGachaMenuManager.class),
		AG_EDITGACHAMENU(AG_EditGachaMenuManager.class),
		AG_TICKETGACHAMENU(AG_TicketGachaMenuManager.class),
		AG_APPLEGACHAMENU(AG_AppleGachaMenuManager.class),
		AP_LISTGACHAMENU(AP_ListGachaMenuManager.class),
		AP_EDITGACHAMENU(AP_EditGachaMenuManager.class),
		AP_TICKETGACHAMENU(AP_TicketGachaMenuManager.class),
		AP_APPLEGACHAMENU(AP_AppleGachaMenuManager.class),
		ADMINLISTGACHAMENU(AdminOldListGachaMenuManager.class),
		ADMINEDITGACHAMENU(AdminOldEditGachaMenuManager.class),
		ADMINTICKETGACHAMENU(AdminOldTicketGachaMenuManager.class),
		ADMINAPPLEGACHAMENU(AdminOldAppleGachaMenuManager.class),
		ACTIVESKILLTYPEMENU(ActiveSkillTypeMenuManager.class),
		ACTIVESKILLTOGGLEMENU(ActiveSkillToggleMenuManager.class),
		EXPLOSIONMENU(ExplosionMenuManager.class),
		E_RANGEMENU(E_RangeMenuManager.class),
		E_EFFECTSELECTMENU(E_EffectSellectMenu.class),
		MD_RANGEMENU(MD_RangeMenuManager.class),
		MAGICDRIVEMENU(MagicDriveMenuManager.class),
		CONDENSATIONMENU(CondensationMenuManager.class),
		C_RANGEMENU(C_RangeMenuManager.class),
		C_ORIGINMENU(C_OriginMenuManager.class),
		RUINFIELDMENU(RuinFieldMenuManager.class),
		R_RANGEMENU(R_RangeMenuManager.class),
		R_ORIGINMENU(R_OriginMenuManager.class),
		FAIRYAEGISMENU(FairyAegisMenuManager.class),
		F_RANGEMENU(F_RangeMenuManager.class),
		PASSIVESKILLTYPEMENU(PassiveSkillTypeMenuManager.class),
		MINESTACKCATEGORYMENU(StackCategoryMenuManager.class),
		BUILDCATEGORYMENU(CategoryBuildMenuManager.class),
		ITEMCATEGORYMENU(CategoryItemMenuManager.class),
		REDSTONECATEGORYMENU(CategoryRedstoneMenuManager.class),
		MATERIALCATEGORYMENU(CategoryMaterialMenuManager.class),
		OTHERWISECATEGORYMENU(CategoryOtherwiseMenuManager.class),
		BUILDMENU(BuildMenuManager.class),
		REGIONMENU(RegionMenuManager.class),
		HUNTMAINMENU(HuntingPointMainMenuManager.class),
		HUNTSHOPMENU(HuntingPointShopMenuManager.class),
		BLOCKCRAFTMENUFIRST(BlockCraftMenuManagerFirstPage.class),
		BLOCKCRAFTMENUSECOND(BlockCraftMenuManagerSecondPage.class),
		BLOCKCRAFTMENUTHIRD(BlockCraftMenuManagerThirdPage.class),
		SEICHIREWARDMENU(SeichiRewardMenuManager.class),
		ZONESKILLDATAMENU(ZoneSkillDataMenuManager.class),
		SERVERSWITCHMENU(ServerSwitchMenuManager.class),
        BLOCKLINEUPMENU(BlockLineUpMenuManager.class),
        PRESENTBOX(PresentBoxMenuManager.class),
		DONATEHISTORYMENU(DonateHistoryMenuManager.class),
		EXCHANGEMENU(ExchangerMenuManager.class),
        GACHASTACKMAINMENU(GachaStackMainMenuManager.class),
        GACHASTACKCATEGORYMENU(GachaStackCategoryMenuManager.class),
        RANKINGSELECTMENU(RankingSelectMenuManager.class),
        TOTALMINEBLOCKRANKINGMENU(TotalMineBlockRankingMenuManager.class),
        DAYMINEBLOCKRANKINGMENU(DayMineBlockRankingMenuManager.class),
        WEEKMINEBLOCKRANKINGMENU(WeekMineBlockRankingMenuManager.class),
        MONTHMINEBLOCKRANKINGMENU(MonthMineBlockRankingMenuManager.class),
        YEARMINEBLOCKRANKINGMENU(YearMineBlockRankingMenuManager.class),
        TOTALBUILDRANKINGMENU(TotalBuildRankingMenuManager.class),
        DAYBUILDRANKINGMENU(DayBuildRankingMenuManager.class),
        WEEKBUILDRANKINGMENU(WeekBuildRankingMenuManager.class),
        MONTHBUILDRANKINGMENU(MonthBuildRankingMenuManager.class),
        YEARBUILDRANKINGMENU(YearBuildRankingMenuManager.class),
        TOTALLOGINTIMERANKINGMENU(TotalLoginTimeRankingMenuManager.class),
        DAYLOGINTIMERANKINGMENU(DayLoginTimeRankingMenuManager.class),
        WEEKLOGINTIMERANKINGMENU(WeekLoginTimeRankingMenuManager.class),
        MONTHLOGINTIMERANKINGMENU(MonthLoginTimeRankingMenuManager.class),
        YEARLOGINTIMERANKINGMENU(YearLoginTimeRankingMenuManager.class),
        TOTALHUNTINGEXPRANKINGMENU(TotalHuntingExpRankingMenuManager.class),
        DAYHUNTINGEXPRANKINGMENU(DayHuntingExpRankingMenuManager.class),
        WEEKHUNTINGEXPRANKINGMENU(WeekHuntingExpRankingMenuManager.class),
        MONTHHUNTINGEXPRANKINGMENU(MonthHuntingExpRankingMenuManager.class),
        YEARHUNTINGEXPRANKINGMENU(YearHuntingExpRankingMenuManager.class),
        TOTALFISHINGEXPRANKINGMENU(TotalFishingExpRankingMenuManager.class),
        DAYFISHINGEXPRANKINGMENU(DayFishingExpRankingMenuManager.class),
        WEEKFISHINGEXPRANKINGMENU(WeekFishingExpRankingMenuManager.class),
        MONTHFISHINGEXPRANKINGMENU(MonthFishingExpRankingMenuManager.class),
        YEARFISHINGEXPRANKINGMENU(YearFishingExpRankingMenuManager.class),
        FISHINGMAINMENU(FishingMainMenuManager.class),
        HELPMENU(HelpMenuManager.class),
		;

		// 使用するManagerClass
		private Class<? extends GuiMenuManager> managerClass;

		private static LinkedHashMap<Class<? extends GuiMenuManager>, ManagerType> managertypemap = new LinkedHashMap<Class<? extends GuiMenuManager>, ManagerType>();

		// Enum用コンストラクタ
		ManagerType(Class<? extends GuiMenuManager> managerClass) {
			this.managerClass = managerClass;
		}

		static {
			for (ManagerType mt : ManagerType.values()) {
				managertypemap.put(mt.getManagerClass(), mt);
			}
		}

		/**
		 * 使用するManagerClassを返り値とします．
		 *
		 * @return Class<? extends YmlManager>
		 */
		public Class<? extends GuiMenuManager> getManagerClass() {
			return managerClass;
		}

		/**
		 * sqlのテーブル名を返り値とします．
		 *
		 * @return String
		 */
		public String getYmlName() {
			return this.name().toLowerCase() + ".yml";
		}

		/**
		 * ManagerClassからテーブル名を取得します．存在しない場合はexampleを返します．
		 *
		 * @param ManagerClass
		 * @return TableName
		 */
		public static String getMenuNamebyClass(
				Class<? extends GuiMenuManager> _class) {
			for (ManagerType ye : ManagerType.values()) {
				if (ye.getManagerClass().equals(_class)) {
					return ye.getYmlName();
				}
			}
			return "example";
		}

		/**
		 * ManagerClassからmanagerTypeを取得します．
		 * @param _class
		 * @return
		 */
		public static ManagerType getTypebyClass(
				Class<? extends GuiMenuManager> _class) {
			return managertypemap.get(_class);
		}
	}

	// 全てのGuiMenuManagerを格納するMap
	private LinkedHashMap<Class<? extends GuiMenuManager>, GuiMenuManager> managermap = new LinkedHashMap<Class<? extends GuiMenuManager>, GuiMenuManager>();

	/**
	 * Class Ymlのコンストラクタです． プラグイン始動時に一度だけ呼び出されます．
	 */
	public GuiMenu() {
		managermap.clear();
		// instance作成
		for (ManagerType ye : ManagerType.values()) {
			try {
				managermap.put(ye.managerClass, ye.getManagerClass()
						.getConstructor().newInstance());
			} catch (InstantiationException | IllegalAccessException
					| IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ManagerClassを引数として，そのクラスのインスタンスを返り値とします． Managerを外部から操作したいときに使用します．
	 *
	 * @param managertype
	 * @return <T extends YmlManager>
	 */
	@SuppressWarnings("unchecked")
	public <T extends GuiMenuManager> T getManager(Class<T> type) {
		return (T) managermap.get(type);
	}

	/**ランキングメニューを自動作成
	 *
	 */
	public void refresh() {
		for (ManagerType ye : ManagerType.values()) {
			if(RankingMenuManager.class.isAssignableFrom(ye.getManagerClass())){
				RankingMenuManager m = (RankingMenuManager) managermap.get(ye.getManagerClass());
				m.reflesh();
			}
		}
	}
}
