package com.mifos.objects.client;

import android.content.ContentValues;
import android.database.Cursor;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.config.DatabaseHolder;
import com.raizlabs.android.dbflow.sql.language.ConditionGroup;
import com.raizlabs.android.dbflow.sql.language.Method;
import com.raizlabs.android.dbflow.sql.language.Select;
import com.raizlabs.android.dbflow.sql.language.property.BaseProperty;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

public final class Currency_Adapter extends ModelAdapter<Currency> {
  public Currency_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<Currency> getModelClass() {
    return Currency.class;
  }

  public final String getTableName() {
    return "`ClientChargeCurrency`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return Currency_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, Currency model) {
    if (model.code != null) {
      values.put(Currency_Table.code.getCursorKey(), model.code);
    } else {
      values.putNull(Currency_Table.code.getCursorKey());
    }
    if (model.name != null) {
      values.put(Currency_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(Currency_Table.name.getCursorKey());
    }
    if (model.decimalPlaces != null) {
      values.put(Currency_Table.decimalPlaces.getCursorKey(), model.decimalPlaces);
    } else {
      values.putNull(Currency_Table.decimalPlaces.getCursorKey());
    }
    if (model.inMultiplesOf != null) {
      values.put(Currency_Table.inMultiplesOf.getCursorKey(), model.inMultiplesOf);
    } else {
      values.putNull(Currency_Table.inMultiplesOf.getCursorKey());
    }
    if (model.displaySymbol != null) {
      values.put(Currency_Table.displaySymbol.getCursorKey(), model.displaySymbol);
    } else {
      values.putNull(Currency_Table.displaySymbol.getCursorKey());
    }
    if (model.nameCode != null) {
      values.put(Currency_Table.nameCode.getCursorKey(), model.nameCode);
    } else {
      values.putNull(Currency_Table.nameCode.getCursorKey());
    }
    if (model.displayLabel != null) {
      values.put(Currency_Table.displayLabel.getCursorKey(), model.displayLabel);
    } else {
      values.putNull(Currency_Table.displayLabel.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, Currency model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, Currency model, int start) {
    if (model.code != null) {
      statement.bindString(1 + start, model.code);
    } else {
      statement.bindNull(1 + start);
    }
    if (model.name != null) {
      statement.bindString(2 + start, model.name);
    } else {
      statement.bindNull(2 + start);
    }
    if (model.decimalPlaces != null) {
      statement.bindLong(3 + start, model.decimalPlaces);
    } else {
      statement.bindNull(3 + start);
    }
    if (model.inMultiplesOf != null) {
      statement.bindLong(4 + start, model.inMultiplesOf);
    } else {
      statement.bindNull(4 + start);
    }
    if (model.displaySymbol != null) {
      statement.bindString(5 + start, model.displaySymbol);
    } else {
      statement.bindNull(5 + start);
    }
    if (model.nameCode != null) {
      statement.bindString(6 + start, model.nameCode);
    } else {
      statement.bindNull(6 + start);
    }
    if (model.displayLabel != null) {
      statement.bindString(7 + start, model.displayLabel);
    } else {
      statement.bindNull(7 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, Currency model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientChargeCurrency`(`code`,`name`,`decimalPlaces`,`inMultiplesOf`,`displaySymbol`,`nameCode`,`displayLabel`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientChargeCurrency`(`code`,`name`,`decimalPlaces`,`inMultiplesOf`,`displaySymbol`,`nameCode`,`displayLabel`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientChargeCurrency`(`code` TEXT,`name` TEXT,`decimalPlaces` INTEGER,`inMultiplesOf` INTEGER,`displaySymbol` TEXT,`nameCode` TEXT,`displayLabel` TEXT, PRIMARY KEY(`code`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, Currency model) {
    int indexcode = cursor.getColumnIndex("code");
    if (indexcode != -1 && !cursor.isNull(indexcode)) {
      model.code = cursor.getString(indexcode);
    } else {
      model.code = null;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexdecimalPlaces = cursor.getColumnIndex("decimalPlaces");
    if (indexdecimalPlaces != -1 && !cursor.isNull(indexdecimalPlaces)) {
      model.decimalPlaces = cursor.getInt(indexdecimalPlaces);
    } else {
      model.decimalPlaces = null;
    }
    int indexinMultiplesOf = cursor.getColumnIndex("inMultiplesOf");
    if (indexinMultiplesOf != -1 && !cursor.isNull(indexinMultiplesOf)) {
      model.inMultiplesOf = cursor.getInt(indexinMultiplesOf);
    } else {
      model.inMultiplesOf = null;
    }
    int indexdisplaySymbol = cursor.getColumnIndex("displaySymbol");
    if (indexdisplaySymbol != -1 && !cursor.isNull(indexdisplaySymbol)) {
      model.displaySymbol = cursor.getString(indexdisplaySymbol);
    } else {
      model.displaySymbol = null;
    }
    int indexnameCode = cursor.getColumnIndex("nameCode");
    if (indexnameCode != -1 && !cursor.isNull(indexnameCode)) {
      model.nameCode = cursor.getString(indexnameCode);
    } else {
      model.nameCode = null;
    }
    int indexdisplayLabel = cursor.getColumnIndex("displayLabel");
    if (indexdisplayLabel != -1 && !cursor.isNull(indexdisplayLabel)) {
      model.displayLabel = cursor.getString(indexdisplayLabel);
    } else {
      model.displayLabel = null;
    }
  }

  @Override
  public final boolean exists(Currency model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Currency.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(Currency model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Currency_Table.code.eq(model.code));return clause;
  }

  @Override
  public final Currency newInstance() {
    return new Currency();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return Currency_Table.getProperty(name);
  }
}
