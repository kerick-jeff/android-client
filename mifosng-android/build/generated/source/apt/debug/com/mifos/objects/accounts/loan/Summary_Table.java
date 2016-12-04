package com.mifos.objects.accounts.loan;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Summary_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.loan.Summary_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> loanId = new Property<Integer>(Summary.class, "loanId");

  public static final Property<Integer> principalDisbursed = new Property<Integer>(Summary.class, "principalDisbursed");

  public static final Property<Double> principalPaid = new Property<Double>(Summary.class, "principalPaid");

  public static final Property<Double> principalOutstanding = new Property<Double>(Summary.class, "principalOutstanding");

  public static final Property<Double> interestCharged = new Property<Double>(Summary.class, "interestCharged");

  public static final Property<Double> interestPaid = new Property<Double>(Summary.class, "interestPaid");

  public static final Property<Double> interestOutstanding = new Property<Double>(Summary.class, "interestOutstanding");

  public static final Property<Double> feeChargesCharged = new Property<Double>(Summary.class, "feeChargesCharged");

  public static final Property<Double> feeChargesPaid = new Property<Double>(Summary.class, "feeChargesPaid");

  public static final Property<Integer> feeChargesOutstanding = new Property<Integer>(Summary.class, "feeChargesOutstanding");

  public static final Property<Integer> penaltyChargesCharged = new Property<Integer>(Summary.class, "penaltyChargesCharged");

  public static final Property<Integer> penaltyChargesPaid = new Property<Integer>(Summary.class, "penaltyChargesPaid");

  public static final Property<Integer> penaltyChargesOutstanding = new Property<Integer>(Summary.class, "penaltyChargesOutstanding");

  public static final Property<Double> totalExpectedRepayment = new Property<Double>(Summary.class, "totalExpectedRepayment");

  public static final Property<Double> totalRepayment = new Property<Double>(Summary.class, "totalRepayment");

  public static final Property<Double> totalOutstanding = new Property<Double>(Summary.class, "totalOutstanding");

  public static final Property<Double> totalOverdue = new Property<Double>(Summary.class, "totalOverdue");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{loanId,principalDisbursed,principalPaid,principalOutstanding,interestCharged,interestPaid,interestOutstanding,feeChargesCharged,feeChargesPaid,feeChargesOutstanding,penaltyChargesCharged,penaltyChargesPaid,penaltyChargesOutstanding,totalExpectedRepayment,totalRepayment,totalOutstanding,totalOverdue};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`loanId`":  {
        return loanId;
      }
      case "`principalDisbursed`":  {
        return principalDisbursed;
      }
      case "`principalPaid`":  {
        return principalPaid;
      }
      case "`principalOutstanding`":  {
        return principalOutstanding;
      }
      case "`interestCharged`":  {
        return interestCharged;
      }
      case "`interestPaid`":  {
        return interestPaid;
      }
      case "`interestOutstanding`":  {
        return interestOutstanding;
      }
      case "`feeChargesCharged`":  {
        return feeChargesCharged;
      }
      case "`feeChargesPaid`":  {
        return feeChargesPaid;
      }
      case "`feeChargesOutstanding`":  {
        return feeChargesOutstanding;
      }
      case "`penaltyChargesCharged`":  {
        return penaltyChargesCharged;
      }
      case "`penaltyChargesPaid`":  {
        return penaltyChargesPaid;
      }
      case "`penaltyChargesOutstanding`":  {
        return penaltyChargesOutstanding;
      }
      case "`totalExpectedRepayment`":  {
        return totalExpectedRepayment;
      }
      case "`totalRepayment`":  {
        return totalRepayment;
      }
      case "`totalOutstanding`":  {
        return totalOutstanding;
      }
      case "`totalOverdue`":  {
        return totalOverdue;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
