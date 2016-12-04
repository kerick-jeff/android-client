package com.mifos.objects.accounts.savings;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class SavingsAccount_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.SavingsAccount_Table.getProperty(columnName); 
  }
  };

  public static final LongProperty clientId = new LongProperty(SavingsAccount.class, "clientId");

  public static final LongProperty groupId = new LongProperty(SavingsAccount.class, "groupId");

  public static final Property<Integer> id = new Property<Integer>(SavingsAccount.class, "id");

  public static final Property<String> accountNo = new Property<String>(SavingsAccount.class, "accountNo");

  public static final Property<Integer> productId = new Property<Integer>(SavingsAccount.class, "productId");

  public static final Property<String> productName = new Property<String>(SavingsAccount.class, "productName");

  public static final Property<Integer> status_id = new Property<Integer>(SavingsAccount.class, "status_id");

  public static final Property<String> currency_code = new Property<String>(SavingsAccount.class, "currency_code");

  public static final Property<Double> accountBalance = new Property<Double>(SavingsAccount.class, "accountBalance");

  public static final Property<Integer> depositType_id = new Property<Integer>(SavingsAccount.class, "depositType_id");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{clientId,groupId,id,accountNo,productId,productName,status_id,currency_code,accountBalance,depositType_id};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`clientId`":  {
        return clientId;
      }
      case "`groupId`":  {
        return groupId;
      }
      case "`id`":  {
        return id;
      }
      case "`accountNo`":  {
        return accountNo;
      }
      case "`productId`":  {
        return productId;
      }
      case "`productName`":  {
        return productName;
      }
      case "`status_id`":  {
        return status_id;
      }
      case "`currency_code`":  {
        return currency_code;
      }
      case "`accountBalance`":  {
        return accountBalance;
      }
      case "`depositType_id`":  {
        return depositType_id;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
