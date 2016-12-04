package com.mifos.objects.accounts.savings;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainer;
import com.raizlabs.android.dbflow.structure.container.ModelContainerAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Currency_Container extends ModelContainerAdapter<Currency> {
  public Currency_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("code", String.class);
    columnMap.put("name", String.class);
    columnMap.put("decimalPlaces", Integer.class);
    columnMap.put("inMultiplesOf", Integer.class);
    columnMap.put("displaySymbol", String.class);
    columnMap.put("nameCode", String.class);
    columnMap.put("displayLabel", String.class);
  }

  @Override
  public final Class<Currency> getModelClass() {
    return Currency.class;
  }

  public final String getTableName() {
    return "`SavingAccountCurrency`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Currency, ?> modelContainer) {
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      values.put(Currency_Table.code.getCursorKey(), modelContainercode);
    } else {
      values.putNull(Currency_Table.code.getCursorKey());
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      values.put(Currency_Table.name.getCursorKey(), modelContainername);
    } else {
      values.putNull(Currency_Table.name.getCursorKey());
    }
    Integer modelContainerdecimalPlaces = modelContainer.getIntegerValue("decimalPlaces");
    if (modelContainerdecimalPlaces != null) {
      values.put(Currency_Table.decimalPlaces.getCursorKey(), modelContainerdecimalPlaces);
    } else {
      values.putNull(Currency_Table.decimalPlaces.getCursorKey());
    }
    Integer modelContainerinMultiplesOf = modelContainer.getIntegerValue("inMultiplesOf");
    if (modelContainerinMultiplesOf != null) {
      values.put(Currency_Table.inMultiplesOf.getCursorKey(), modelContainerinMultiplesOf);
    } else {
      values.putNull(Currency_Table.inMultiplesOf.getCursorKey());
    }
    String modelContainerdisplaySymbol = modelContainer.getStringValue("displaySymbol");
    if (modelContainerdisplaySymbol != null) {
      values.put(Currency_Table.displaySymbol.getCursorKey(), modelContainerdisplaySymbol);
    } else {
      values.putNull(Currency_Table.displaySymbol.getCursorKey());
    }
    String modelContainernameCode = modelContainer.getStringValue("nameCode");
    if (modelContainernameCode != null) {
      values.put(Currency_Table.nameCode.getCursorKey(), modelContainernameCode);
    } else {
      values.putNull(Currency_Table.nameCode.getCursorKey());
    }
    String modelContainerdisplayLabel = modelContainer.getStringValue("displayLabel");
    if (modelContainerdisplayLabel != null) {
      values.put(Currency_Table.displayLabel.getCursorKey(), modelContainerdisplayLabel);
    } else {
      values.putNull(Currency_Table.displayLabel.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Currency, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Currency, ?> modelContainer, int start) {
    String modelContainercode = modelContainer.getStringValue("code");
    if (modelContainercode != null) {
      statement.bindString(1 + start, modelContainercode);
    } else {
      statement.bindNull(1 + start);
    }
    String modelContainername = modelContainer.getStringValue("name");
    if (modelContainername != null) {
      statement.bindString(2 + start, modelContainername);
    } else {
      statement.bindNull(2 + start);
    }
    Integer modelContainerdecimalPlaces = modelContainer.getIntegerValue("decimalPlaces");
    if (modelContainerdecimalPlaces != null) {
      statement.bindLong(3 + start, modelContainerdecimalPlaces);
    } else {
      statement.bindNull(3 + start);
    }
    Integer modelContainerinMultiplesOf = modelContainer.getIntegerValue("inMultiplesOf");
    if (modelContainerinMultiplesOf != null) {
      statement.bindLong(4 + start, modelContainerinMultiplesOf);
    } else {
      statement.bindNull(4 + start);
    }
    String modelContainerdisplaySymbol = modelContainer.getStringValue("displaySymbol");
    if (modelContainerdisplaySymbol != null) {
      statement.bindString(5 + start, modelContainerdisplaySymbol);
    } else {
      statement.bindNull(5 + start);
    }
    String modelContainernameCode = modelContainer.getStringValue("nameCode");
    if (modelContainernameCode != null) {
      statement.bindString(6 + start, modelContainernameCode);
    } else {
      statement.bindNull(6 + start);
    }
    String modelContainerdisplayLabel = modelContainer.getStringValue("displayLabel");
    if (modelContainerdisplayLabel != null) {
      statement.bindString(7 + start, modelContainerdisplayLabel);
    } else {
      statement.bindNull(7 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Currency, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Currency, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Currency.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Currency, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Currency_Table.code.eq(modelContainer.getStringValue("code")));return clause;
  }

  @Override
  public final Currency toModel(ModelContainer<Currency, ?> modelContainer) {
    Currency model = new Currency();
    model.code = modelContainer.getStringValue("code");
    model.name = modelContainer.getStringValue("name");
    model.decimalPlaces = modelContainer.getIntegerValue("decimalPlaces");
    model.inMultiplesOf = modelContainer.getIntegerValue("inMultiplesOf");
    model.displaySymbol = modelContainer.getStringValue("displaySymbol");
    model.nameCode = modelContainer.getStringValue("nameCode");
    model.displayLabel = modelContainer.getStringValue("displayLabel");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Currency, ?> modelContainer) {
    int indexcode = cursor.getColumnIndex("code");
    if (indexcode != -1 && !cursor.isNull(indexcode)) {
      modelContainer.put("code", cursor.getString(indexcode));
    } else {
      modelContainer.putDefault("code");
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      modelContainer.put("name", cursor.getString(indexname));
    } else {
      modelContainer.putDefault("name");
    }
    int indexdecimalPlaces = cursor.getColumnIndex("decimalPlaces");
    if (indexdecimalPlaces != -1 && !cursor.isNull(indexdecimalPlaces)) {
      modelContainer.put("decimalPlaces", cursor.getInt(indexdecimalPlaces));
    } else {
      modelContainer.putDefault("decimalPlaces");
    }
    int indexinMultiplesOf = cursor.getColumnIndex("inMultiplesOf");
    if (indexinMultiplesOf != -1 && !cursor.isNull(indexinMultiplesOf)) {
      modelContainer.put("inMultiplesOf", cursor.getInt(indexinMultiplesOf));
    } else {
      modelContainer.putDefault("inMultiplesOf");
    }
    int indexdisplaySymbol = cursor.getColumnIndex("displaySymbol");
    if (indexdisplaySymbol != -1 && !cursor.isNull(indexdisplaySymbol)) {
      modelContainer.put("displaySymbol", cursor.getString(indexdisplaySymbol));
    } else {
      modelContainer.putDefault("displaySymbol");
    }
    int indexnameCode = cursor.getColumnIndex("nameCode");
    if (indexnameCode != -1 && !cursor.isNull(indexnameCode)) {
      modelContainer.put("nameCode", cursor.getString(indexnameCode));
    } else {
      modelContainer.putDefault("nameCode");
    }
    int indexdisplayLabel = cursor.getColumnIndex("displayLabel");
    if (indexdisplayLabel != -1 && !cursor.isNull(indexdisplayLabel)) {
      modelContainer.put("displayLabel", cursor.getString(indexdisplayLabel));
    } else {
      modelContainer.putDefault("displayLabel");
    }
  }

  @Override
  public final ForeignKeyContainer<Currency> toForeignKeyContainer(Currency model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Currency.class);
    modelContainer.put(Currency_Table.code, model.code);
    return modelContainer;
  }
}
