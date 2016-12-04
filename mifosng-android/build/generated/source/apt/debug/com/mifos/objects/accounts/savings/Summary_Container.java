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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Summary_Container extends ModelContainerAdapter<Summary> {
  public Summary_Container(DatabaseHolder holder, DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
    columnMap.put("savingsId", Integer.class);
    columnMap.put("totalDeposits", Double.class);
    columnMap.put("accountBalance", Double.class);
    columnMap.put("totalWithdrawals", Double.class);
    columnMap.put("totalInterestEarned", Double.class);
  }

  @Override
  public final Class<Summary> getModelClass() {
    return Summary.class;
  }

  public final String getTableName() {
    return "`SavingsAccountSummary`";
  }

  @Override
  public final void bindToInsertValues(ContentValues values, ModelContainer<Summary, ?> modelContainer) {
    Integer modelContainersavingsId = modelContainer.getIntegerValue("savingsId");
    if (modelContainersavingsId != null) {
      values.put(Summary_Table.savingsId.getCursorKey(), modelContainersavingsId);
    } else {
      values.putNull(Summary_Table.savingsId.getCursorKey());
    }
    Double modelContainertotalDeposits = modelContainer.getDoubleValue("totalDeposits");
    if (modelContainertotalDeposits != null) {
      values.put(Summary_Table.totalDeposits.getCursorKey(), modelContainertotalDeposits);
    } else {
      values.putNull(Summary_Table.totalDeposits.getCursorKey());
    }
    Double modelContaineraccountBalance = modelContainer.getDoubleValue("accountBalance");
    if (modelContaineraccountBalance != null) {
      values.put(Summary_Table.accountBalance.getCursorKey(), modelContaineraccountBalance);
    } else {
      values.putNull(Summary_Table.accountBalance.getCursorKey());
    }
    Double modelContainertotalWithdrawals = modelContainer.getDoubleValue("totalWithdrawals");
    if (modelContainertotalWithdrawals != null) {
      values.put(Summary_Table.totalWithdrawals.getCursorKey(), modelContainertotalWithdrawals);
    } else {
      values.putNull(Summary_Table.totalWithdrawals.getCursorKey());
    }
    Double modelContainertotalInterestEarned = modelContainer.getDoubleValue("totalInterestEarned");
    if (modelContainertotalInterestEarned != null) {
      values.put(Summary_Table.totalInterestEarned.getCursorKey(), modelContainertotalInterestEarned);
    } else {
      values.putNull(Summary_Table.totalInterestEarned.getCursorKey());
    }
  }

  @Override
  public final void bindToContentValues(ContentValues values, ModelContainer<Summary, ?> modelContainer) {
    bindToInsertValues(values, modelContainer);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, ModelContainer<Summary, ?> modelContainer, int start) {
    Integer modelContainersavingsId = modelContainer.getIntegerValue("savingsId");
    if (modelContainersavingsId != null) {
      statement.bindLong(1 + start, modelContainersavingsId);
    } else {
      statement.bindNull(1 + start);
    }
    Double modelContainertotalDeposits = modelContainer.getDoubleValue("totalDeposits");
    if (modelContainertotalDeposits != null) {
      statement.bindDouble(2 + start, modelContainertotalDeposits);
    } else {
      statement.bindNull(2 + start);
    }
    Double modelContaineraccountBalance = modelContainer.getDoubleValue("accountBalance");
    if (modelContaineraccountBalance != null) {
      statement.bindDouble(3 + start, modelContaineraccountBalance);
    } else {
      statement.bindNull(3 + start);
    }
    Double modelContainertotalWithdrawals = modelContainer.getDoubleValue("totalWithdrawals");
    if (modelContainertotalWithdrawals != null) {
      statement.bindDouble(4 + start, modelContainertotalWithdrawals);
    } else {
      statement.bindNull(4 + start);
    }
    Double modelContainertotalInterestEarned = modelContainer.getDoubleValue("totalInterestEarned");
    if (modelContainertotalInterestEarned != null) {
      statement.bindDouble(5 + start, modelContainertotalInterestEarned);
    } else {
      statement.bindNull(5 + start);
    }
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, ModelContainer<Summary, ?> modelContainer) {
    bindToInsertStatement(statement, modelContainer, 0);
  }

  @Override
  public final boolean exists(ModelContainer<Summary, ?> modelContainer, DatabaseWrapper wrapper) {
    return new Select(Method.count()).from(Summary.class).where(getPrimaryConditionClause(modelContainer)).count(wrapper) > 0;
  }

  @Override
  public final ConditionGroup getPrimaryConditionClause(ModelContainer<Summary, ?> modelContainer) {
    ConditionGroup clause = ConditionGroup.clause();
    clause.and(Summary_Table.savingsId.eq(modelContainer.getIntegerValue("savingsId")));return clause;
  }

  @Override
  public final Summary toModel(ModelContainer<Summary, ?> modelContainer) {
    Summary model = new Summary();
    model.savingsId = modelContainer.getIntegerValue("savingsId");
    model.totalDeposits = modelContainer.getDoubleValue("totalDeposits");
    model.accountBalance = modelContainer.getDoubleValue("accountBalance");
    model.totalWithdrawals = modelContainer.getDoubleValue("totalWithdrawals");
    model.totalInterestEarned = modelContainer.getDoubleValue("totalInterestEarned");
    return model;
  }

  @Override
  public final void loadFromCursor(Cursor cursor, ModelContainer<Summary, ?> modelContainer) {
    int indexsavingsId = cursor.getColumnIndex("savingsId");
    if (indexsavingsId != -1 && !cursor.isNull(indexsavingsId)) {
      modelContainer.put("savingsId", cursor.getInt(indexsavingsId));
    } else {
      modelContainer.putDefault("savingsId");
    }
    int indextotalDeposits = cursor.getColumnIndex("totalDeposits");
    if (indextotalDeposits != -1 && !cursor.isNull(indextotalDeposits)) {
      modelContainer.put("totalDeposits", cursor.getDouble(indextotalDeposits));
    } else {
      modelContainer.putDefault("totalDeposits");
    }
    int indexaccountBalance = cursor.getColumnIndex("accountBalance");
    if (indexaccountBalance != -1 && !cursor.isNull(indexaccountBalance)) {
      modelContainer.put("accountBalance", cursor.getDouble(indexaccountBalance));
    } else {
      modelContainer.putDefault("accountBalance");
    }
    int indextotalWithdrawals = cursor.getColumnIndex("totalWithdrawals");
    if (indextotalWithdrawals != -1 && !cursor.isNull(indextotalWithdrawals)) {
      modelContainer.put("totalWithdrawals", cursor.getDouble(indextotalWithdrawals));
    } else {
      modelContainer.putDefault("totalWithdrawals");
    }
    int indextotalInterestEarned = cursor.getColumnIndex("totalInterestEarned");
    if (indextotalInterestEarned != -1 && !cursor.isNull(indextotalInterestEarned)) {
      modelContainer.put("totalInterestEarned", cursor.getDouble(indextotalInterestEarned));
    } else {
      modelContainer.putDefault("totalInterestEarned");
    }
  }

  @Override
  public final ForeignKeyContainer<Summary> toForeignKeyContainer(Summary model) {
    ForeignKeyContainer modelContainer = new ForeignKeyContainer<>(Summary.class);
    modelContainer.put(Summary_Table.savingsId, model.savingsId);
    return modelContainer;
  }
}
