package com.mifos.objects.client;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.LongProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Charges_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.client.Charges_Table.getProperty(columnName); 
  }
  };

  public static final Property<Integer> id = new Property<Integer>(Charges.class, "id");

  public static final Property<Integer> clientId = new Property<Integer>(Charges.class, "clientId");

  public static final Property<Integer> loanId = new Property<Integer>(Charges.class, "loanId");

  public static final Property<Integer> chargeId = new Property<Integer>(Charges.class, "chargeId");

  public static final Property<String> name = new Property<String>(Charges.class, "name");

  public static final Property<Integer> chargeTimeType_id = new Property<Integer>(Charges.class, "chargeTimeType_id");

  public static final LongProperty chargeDueDate_clientId = new LongProperty(Charges.class, "chargeDueDate_clientId");

  public static final LongProperty chargeDueDate_chargeId = new LongProperty(Charges.class, "chargeDueDate_chargeId");

  public static final Property<Integer> chargeCalculationType_id = new Property<Integer>(Charges.class, "chargeCalculationType_id");

  public static final Property<String> currency_code = new Property<String>(Charges.class, "currency_code");

  public static final Property<Double> amount = new Property<Double>(Charges.class, "amount");

  public static final Property<Double> amountPaid = new Property<Double>(Charges.class, "amountPaid");

  public static final Property<Double> amountWaived = new Property<Double>(Charges.class, "amountWaived");

  public static final Property<Double> amountWrittenOff = new Property<Double>(Charges.class, "amountWrittenOff");

  public static final Property<Double> amountOutstanding = new Property<Double>(Charges.class, "amountOutstanding");

  public static final Property<Boolean> penalty = new Property<Boolean>(Charges.class, "penalty");

  public static final Property<Boolean> isActive = new Property<Boolean>(Charges.class, "isActive");

  public static final Property<Boolean> isPaid = new Property<Boolean>(Charges.class, "isPaid");

  public static final Property<Boolean> isWaived = new Property<Boolean>(Charges.class, "isWaived");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,clientId,loanId,chargeId,name,chargeTimeType_id,chargeDueDate_clientId,chargeDueDate_chargeId,chargeCalculationType_id,currency_code,amount,amountPaid,amountWaived,amountWrittenOff,amountOutstanding,penalty,isActive,isPaid,isWaived};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`clientId`":  {
        return clientId;
      }
      case "`loanId`":  {
        return loanId;
      }
      case "`chargeId`":  {
        return chargeId;
      }
      case "`name`":  {
        return name;
      }
      case "`chargeTimeType_id`":  {
        return chargeTimeType_id;
      }
      case "`chargeDueDate_clientId`":  {
        return chargeDueDate_clientId;
      }
      case "`chargeDueDate_chargeId`":  {
        return chargeDueDate_chargeId;
      }
      case "`chargeCalculationType_id`":  {
        return chargeCalculationType_id;
      }
      case "`currency_code`":  {
        return currency_code;
      }
      case "`amount`":  {
        return amount;
      }
      case "`amountPaid`":  {
        return amountPaid;
      }
      case "`amountWaived`":  {
        return amountWaived;
      }
      case "`amountWrittenOff`":  {
        return amountWrittenOff;
      }
      case "`amountOutstanding`":  {
        return amountOutstanding;
      }
      case "`penalty`":  {
        return penalty;
      }
      case "`isActive`":  {
        return isActive;
      }
      case "`isPaid`":  {
        return isPaid;
      }
      case "`isWaived`":  {
        return isWaived;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
