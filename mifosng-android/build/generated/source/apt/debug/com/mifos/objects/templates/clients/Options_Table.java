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
public final class Options_Table {
  public static final PropertyConverter PROPERTY_CONVERTER = new PropertyConverter(){ 
  public IProperty fromName(String columnName) {
  return com.mifos.objects.templates.clients.Options_Table.getProperty(columnName); 
  }
  };

  public static final Property<String> genderOptions = new Property<String>(Options.class, "genderOptions");

  public static final Property<String> clientTypeOptions = new Property<String>(Options.class, "clientTypeOptions");

  public static final Property<String> clientClassificationOptions = new Property<String>(Options.class, "clientClassificationOptions");

  public static final IntProperty id = new IntProperty(Options.class, "id");

  public static final Property<String> name = new Property<String>(Options.class, "name");

  public static final IntProperty position = new IntProperty(Options.class, "position");

  public static final Property<String> description = new Property<String>(Options.class, "description");

  public static final Property<Boolean> activeStatus = new Property<Boolean>(Options.class, "activeStatus");

  public static final IProperty[] getAllColumnProperties() {
    return new IProperty[]{genderOptions,clientTypeOptions,clientClassificationOptions,id,name,position,description,activeStatus};
  }

  public static BaseProperty getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch (columnName)  {
      case "`genderOptions`":  {
        return genderOptions;
      }
      case "`clientTypeOptions`":  {
        return clientTypeOptions;
      }
      case "`clientClassificationOptions`":  {
        return clientClassificationOptions;
      }
      case "`id`":  {
        return id;
      }
      case "`name`":  {
        return name;
      }
      case "`position`":  {
        return position;
      }
      case "`description`":  {
        return description;
      }
      case "`activeStatus`":  {
        return activeStatus;
      }
      default:  {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }
}
