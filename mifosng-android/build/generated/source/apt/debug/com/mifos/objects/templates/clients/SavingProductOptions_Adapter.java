package com.mifos.objects.templates.clients;

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

public final class SavingProductOptions_Adapter extends ModelAdapter<SavingProductOptions> {
  public SavingProductOptions_Adapter(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<SavingProductOptions> getModelClass() {
    return SavingProductOptions.class;
  }

  public final String getTableName() {
    return "`ClientTemplateSavingProductsOptions`";
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return SavingProductOptions_Table.getAllColumnProperties();
  }

  @Override
  public final void bindToInsertValues(ContentValues values, SavingProductOptions model) {
    values.put(SavingProductOptions_Table.id.getCursorKey(), model.id);
    if (model.name != null) {
      values.put(SavingProductOptions_Table.name.getCursorKey(), model.name);
    } else {
      values.putNull(SavingProductOptions_Table.name.getCursorKey());
    }
    values.put(SavingProductOptions_Table.withdrawalFeeForTransfers.getCursorKey(), model.withdrawalFeeForTransfers ? 1 : 0);
    values.put(SavingProductOptions_Table.allowOverdraft.getCursorKey(), model.allowOverdraft ? 1 : 0);
  }

  @Override
  public final void bindToContentValues(ContentValues values, SavingProductOptions model) {
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, SavingProductOptions model, int start) {
    statement.bindLong(1 + start, model.id);
    if (model.name != null) {
      statement.bindString(2 + start, model.name);
    } else {
      statement.bindNull(2 + start);
    }
    statement.bindLong(3 + start, model.withdrawalFeeForTransfers ? 1 : 0);
    statement.bindLong(4 + start, model.allowOverdraft ? 1 : 0);
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, SavingProductOptions model) {
    bindToInsertStatement(statement, model, 0);
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ClientTemplateSavingProductsOptions`(`id`,`name`,`withdrawalFeeForTransfers`,`allowOverdraft`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ClientTemplateSavingProductsOptions`(`id`,`name`,`withdrawalFeeForTransfers`,`allowOverdraft`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ClientTemplateSavingProductsOptions`(`id` INTEGER,`name` TEXT,`withdrawalFeeForTransfers` INTEGER,`allowOverdraft` INTEGER, PRIMARY KEY(`id`)" + ");";
  }

  @Override
  public final void loadFromCursor(Cursor cursor, SavingProductOptions model) {
    int indexid = cursor.getColumnIndex("id");
    if (indexid != -1 && !cursor.isNull(indexid)) {
      model.id = cursor.getInt(indexid);
    } else {
      model.id = 0;
    }
    int indexname = cursor.getColumnIndex("name");
    if (indexname != -1 && !cursor.isNull(indexname)) {
      model.name = cursor.getString(indexname);
    } else {
      model.name = null;
    }
    int indexwithdrawalFeeForTransfers = cursor.getColumnIndex("withdrawalFeeForTransfers");
    if (indexwithdrawalFeeForTransfers != -1 && !cursor.isNull(indexwithdrawalFeeForTransfers)) {
      model.withdrawalFeeForTransfers = cursor.getInt(indexwithdrawalFeeForTransfers) == 1 ? true : false;
    } else {
      model.withdrawalFeeForTransfers = false;
    }
    int indexallowOverdraft = cursor.getColumnIndex("allowOverdraft");
    if (indexallowOverdraft != -1 && !cursor.isNull(indexallowOverdraft)) {
      model.allowOverdraft = cursor.getInt(indexallowOverdraft) == 1 ? true : false;
    } else {
      model.allowOverdraft = false;
    }
  }

  @Override
  public final boolean exists(SavingProductOptions model, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(SavingProductOptions.class).where(getPrimaryConditionClause(model)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(SavingProductOptions model) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(SavingProductOptions_Table.id.eq(model.id));return clause;
  }

  @Override
  public final SavingProductOptions newInstance() {
    return new SavingProductOptions();
  }

  @Override
  public final BaseProperty getProperty(String name) {
    return SavingProductOptions_Table.getProperty(name);
  }
}
