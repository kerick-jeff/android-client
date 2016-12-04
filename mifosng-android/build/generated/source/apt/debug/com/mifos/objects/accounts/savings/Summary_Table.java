package com.mifos.objects.accounts.savings;

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
  return com.mifos.objects.accounts.savings.Summary_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> savingsId = new Property<Integer>(Summary.class, "savingsId");

  public static final Property<Double> totalDeposits = new Property<Double>(Summary.class, "totalDeposits");

  public static final Property<Double> accountBalance = new Property<Double>(Summary.class, "accountBalance");

  public static final Property<Double> totalWithdrawals = new Property<Double>(Summary.class, "totalWithdrawals");

  public static final Property<Double> totalInterestEarned = new Property<Double>(Summary.class, "totalInterestEarned");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{savingsId,totalDeposits,accountBalance,totalWithdrawals,totalInterestEarned};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`savingsId`":  {
        return savingsId;
      }
      case "`totalDeposits`":  {
        return totalDeposits;
      }
      case "`accountBalance`":  {
        return accountBalance;
      }
      case "`totalWithdrawals`":  {
        return totalWithdrawals;
      }
      case "`totalInterestEarned`":  {
        return totalInterestEarned;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
