package entireSDET;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC02_NCSelectTag extends BaseClass{
	
	
	@Test(priority = 1, groups = "Select Tags")
	public void OrdersPageFields() {
		
		NCLoginPage login = new NCLoginPage(driver);
		NCOrdersPage orders = new NCOrdersPage(driver);
		NCCommonUtil common = new NCCommonUtil(driver);
		SoftAssert asrt = new SoftAssert();
		
		login.clickLoginBtn();
		common.clickOnSales();
		common.clickOnOrders();
		
		orders.warehouseGetAllOpts();
		orders.warehouseSelectOrDeselectOpt().selectByVisibleText(warehouseopt2);
		asrt.assertEquals(warehouseopt2, orders.warehousegetSelectedopt(), "Error; Select options are not same by Visible Text");
		orders.warehouseSelectOrDeselectOpt().selectByIndex(0);
		asrt.assertEquals(warehouseopt1, orders.warehousegetSelectedopt(), "Error; Select options are not same by Index");
		orders.setOrderStatusesField(orderStatuses);
		asrt.assertAll();
	}
	
	@Test(priority = 2, groups = "Webtable")
	public void ordersWebtable() {
		NCOrdersPage orders = new NCOrdersPage(driver);
		orders.tRowsCount();
		orders.tColumnsCount();
		orders.getTableValues();
		
	}
}
