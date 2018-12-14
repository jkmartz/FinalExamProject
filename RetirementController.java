package pkgApp.controller;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private Label lblNeedToSave;
	
	@FXML
	private TextField txtRetiredAnnualReturn;
	
	@FXML
	private TextField txtWorkAnnualReturn;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private TextField txtYearsRetired;

	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private TextField txtRequiredIncome;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear pressed");
		System.out.println("This is new");
		lblSaveEachMonth.setText("");
		lblNeedToSave.setText("");
		txtWorkAnnualReturn.setText("");
		txtRetiredAnnualReturn.setText("");
		txtYearsToWork.setText("");
		txtYearsRetired.setText("");
		txtMonthlySSI.setText("");
		txtRequiredIncome.setText("");

		//	Done Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) {
		double dAnnualReturnWorking = Double.parseDouble(txtWorkAnnualReturn.getAccessibleText());
		int iYearsRetired = Integer.parseInt(txtYearsRetired.getAccessibleText());
		double dRetiredAnnualReturn = Double.parseDouble(txtRetiredAnnualReturn.getAccessibleText());
		double dRequiredIncome = Double.parseDouble(txtRequiredIncome.getAccessibleText());
		double dMonthlySSI = Double.parseDouble(txtMonthlySSI.getAccessibleText());
		Retirement rtm = new Retirement(dAnnualReturnWorking, iYearsRetired, dRetiredAnnualReturn, dRequiredIncome,dMonthlySSI);
		lblNeedToSave.setText(Double.toString(rtm.TotalAmountSaved()));
		lblSaveEachMonth.setText(Double.toString(rtm.AmountToSave()));
		//AmountToSave and TotalAmountSaved and populate 
		
	}
	
}
