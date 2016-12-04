package com.mifos.objects.accounts.savings;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class SavingsAccountTransactionRequest_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.savings.SavingsAccountTransactionRequest_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> savingAccountId = new Property<Integer>(SavingsAccountTransactionRequest.class, "savingAccountId");

  public static final Property<String> savingsAccountType = new Property<String>(SavingsAccountTransactionRequest.class, "savingsAccountType");

  public static final Property<String> transactionType = new Property<String>(SavingsAccountTransactionRequest.class, "transactionType");

  public static final Property<String> dateFormat = new Property<String>(SavingsAccountTransactionRequest.class, "dateFormat");

  public static final Property<String> locale = new Property<String>(SavingsAccountTransactionRequest.class, "locale");

  public static final Property<String> transactionDate = new Property<String>(SavingsAccountTransactionRequest.class, "transactionDate");

  public static final Property<String> transactionAmount = new Property<String>(SavingsAccountTransactionRequest.class, "transactionAmount");

  public static final Property<String> paymentTypeId = new Property<String>(SavingsAccountTransactionRequest.class, "paymentTypeId");

  public static final Property<String> note = new Property<String>(SavingsAccountTransactionRequest.class, "note");

  public static final Property<String> accountNumber = new Property<String>(SavingsAccountTransactionRequest.class, "accountNumber");

  public static final Property<String> checkNumber = new Property<String>(SavingsAccountTransactionRequest.class, "checkNumber");

  public static final Property<String> routingCode = new Property<String>(SavingsAccountTransactionRequest.class, "routingCode");

  public static final Property<String> receiptNumber = new Property<String>(SavingsAccountTransactionRequest.class, "receiptNumber");

  public static final Property<String> bankNumber = new Property<String>(SavingsAccountTransactionRequest.class, "bankNumber");

  public static final Property<String> errorMessage = new Property<String>(SavingsAccountTransactionRequest.class, "errorMessage");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{savingAccountId,savingsAccountType,transactionType,dateFormat,locale,transactionDate,transactionAmount,paymentTypeId,note,accountNumber,checkNumber,routingCode,receiptNumber,bankNumber,errorMessage};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`savingAccountId`":  {
        return savingAccountId;
      }
      case "`savingsAccountType`":  {
        return savingsAccountType;
      }
      case "`transactionType`":  {
        return transactionType;
      }
      case "`dateFormat`":  {
        return dateFormat;
      }
      case "`locale`":  {
        return locale;
      }
      case "`transactionDate`":  {
        return transactionDate;
      }
      case "`transactionAmount`":  {
        return transactionAmount;
      }
      case "`paymentTypeId`":  {
        return paymentTypeId;
      }
      case "`note`":  {
        return note;
      }
      case "`accountNumber`":  {
        return accountNumber;
      }
      case "`checkNumber`":  {
        return checkNumber;
      }
      case "`routingCode`":  {
        return routingCode;
      }
      case "`receiptNumber`":  {
        return receiptNumber;
      }
      case "`bankNumber`":  {
        return bankNumber;
      }
      case "`errorMessage`":  {
        return errorMessage;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
