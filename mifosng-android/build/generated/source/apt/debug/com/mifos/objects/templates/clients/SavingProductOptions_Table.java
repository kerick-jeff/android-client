package com.mifos.objects.templates.clients;

import com.raizlabs.android.dbflow.runtime.BaseContentProvider.PropertyConverter;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.IntProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class SavingProductOptions_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.templates.clients.SavingProductOptions_Table.getProperty(columnName); 
  }
  };

  public static final IntProperty id = new IntProperty(SavingProductOptions.class, "id");

  public static final Property<String> name = new Property<String>(SavingProductOptions.class, "name");

  public static final Property<Boolean> withdrawalFeeForTransfers = new Property<Boolean>(SavingProductOptions.class, "withdrawalFeeForTransfers");

  public static final Property<Boolean> allowOverdraft = new Property<Boolean>(SavingProductOptions.class, "allowOverdraft");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{id,name,withdrawalFeeForTransfers,allowOverdraft};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`id`":  {
        return id;
      }
      case "`name`":  {
        return name;
      }
      case "`withdrawalFeeForTransfers`":  {
        return withdrawalFeeForTransfers;
      }
      case "`allowOverdraft`":  {
        return allowOverdraft;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
