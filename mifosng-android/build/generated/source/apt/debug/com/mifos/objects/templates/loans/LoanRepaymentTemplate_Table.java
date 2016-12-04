package com.mifos.objects.templates.loans;

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
public final class LoanRepaymentTemplate_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.templates.loans.LoanRepaymentTemplate_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> loanId = new Property<Integer>(LoanRepaymentTemplate.class, "loanId");

  public static final Property<Double> amount = new Property<Double>(LoanRepaymentTemplate.class, "amount");

  public static final Property<Double> principalPortion = new Property<Double>(LoanRepaymentTemplate.class, "principalPortion");

  public static final Property<Double> interestPortion = new Property<Double>(LoanRepaymentTemplate.class, "interestPortion");

  public static final Property<Integer> feeChargesPortion = new Property<Integer>(LoanRepaymentTemplate.class, "feeChargesPortion");

  public static final Property<Integer> penaltyChargesPortion = new Property<Integer>(LoanRepaymentTemplate.class, "penaltyChargesPortion");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{loanId,amount,principalPortion,interestPortion,feeChargesPortion,penaltyChargesPortion};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`loanId`":  {
        return loanId;
      }
      case "`amount`":  {
        return amount;
      }
      case "`principalPortion`":  {
        return principalPortion;
      }
      case "`interestPortion`":  {
        return interestPortion;
      }
      case "`feeChargesPortion`":  {
        return feeChargesPortion;
      }
      case "`penaltyChargesPortion`":  {
        return penaltyChargesPortion;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
