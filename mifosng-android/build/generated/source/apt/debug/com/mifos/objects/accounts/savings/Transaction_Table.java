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
public final class Transaction_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.Transaction_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Transaction.class, "id");

  public static final Property<Integer> savingsAccountId = new Property<Integer>(Transaction.class, "savingsAccountId");

  public static final Property<Integer> transactionType_id = new Property<Integer>(Transaction.class, "transactionType_id");

  public static final Property<Integer> savingsTransactionDate_transactionId = new Property<Integer>(Transaction.class, "savingsTransactionDate_transactionId");

  public static final Property<String> currency_code = new Property<String>(Transaction.class, "currency_code");

  public static final Property<Double> amount = new Property<Double>(Transaction.class, "amount");

  public static final Property<Double> runningBalance = new Property<Double>(Transaction.class, "runningBalance");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,savingsAccountId,transactionType_id,savingsTransactionDate_transactionId,currency_code,amount,runningBalance};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`savingsAccountId`":  {
        return savingsAccountId;
      }
      case "`transactionType_id`":  {
        return transactionType_id;
      }
      case "`savingsTransactionDate_transactionId`":  {
        return savingsTransactionDate_transactionId;
      }
      case "`currency_code`":  {
        return currency_code;
      }
      case "`amount`":  {
        return amount;
      }
      case "`runningBalance`":  {
        return runningBalance;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
