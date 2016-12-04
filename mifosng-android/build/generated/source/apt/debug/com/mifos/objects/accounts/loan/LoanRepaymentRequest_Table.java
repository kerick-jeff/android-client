package com.mifos.objects.accounts.loan;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class LoanRepaymentRequest_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.accounts.loan.LoanRepaymentRequest_Table.getProperty(columnName); 
  }
  };

  public static final LongProperty timeStamp = new LongProperty(LoanRepaymentRequest.class, "timeStamp");

  public static final Property<Integer> loanId = new Property<Integer>(LoanRepaymentRequest.class, "loanId");

  public static final Property<String> errorMessage = new Property<String>(LoanRepaymentRequest.class, "errorMessage");

  public static final Property<String> dateFormat = new Property<String>(LoanRepaymentRequest.class, "dateFormat");

  public static final Property<String> locale = new Property<String>(LoanRepaymentRequest.class, "locale");

  public static final Property<String> transactionDate = new Property<String>(LoanRepaymentRequest.class, "transactionDate");

  public static final Property<String> transactionAmount = new Property<String>(LoanRepaymentRequest.class, "transactionAmount");

  public static final Property<String> paymentTypeId = new Property<String>(LoanRepaymentRequest.class, "paymentTypeId");

  public static final Property<String> note = new Property<String>(LoanRepaymentRequest.class, "note");

  public static final Property<String> accountNumber = new Property<String>(LoanRepaymentRequest.class, "accountNumber");

  public static final Property<String> checkNumber = new Property<String>(LoanRepaymentRequest.class, "checkNumber");

  public static final Property<String> routingCode = new Property<String>(LoanRepaymentRequest.class, "routingCode");

  public static final Property<String> receiptNumber = new Property<String>(LoanRepaymentRequest.class, "receiptNumber");

  public static final Property<String> bankNumber = new Property<String>(LoanRepaymentRequest.class, "bankNumber");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{timeStamp,loanId,errorMessage,dateFormat,locale,transactionDate,transactionAmount,paymentTypeId,note,accountNumber,checkNumber,routingCode,receiptNumber,bankNumber};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`timeStamp`":  {
        return timeStamp;
      }
      case "`loanId`":  {
        return loanId;
      }
      case "`errorMessage`":  {
        return errorMessage;
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
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
