package com.mifos.mifosxdroid.injection.component;

import android.app.Application;
import android.content.Context;
import com.mifos.api.BaseApiManager;
import com.mifos.api.DataManager;
import com.mifos.api.DataManager_Factory;
import com.mifos.api.datamanager.DataManagerCenter;
import com.mifos.api.datamanager.DataManagerCenter_Factory;
import com.mifos.api.datamanager.DataManagerCharge;
import com.mifos.api.datamanager.DataManagerCharge_Factory;
import com.mifos.api.datamanager.DataManagerClient;
import com.mifos.api.datamanager.DataManagerClient_Factory;
import com.mifos.api.datamanager.DataManagerDataTable;
import com.mifos.api.datamanager.DataManagerDataTable_Factory;
import com.mifos.api.datamanager.DataManagerDocument;
import com.mifos.api.datamanager.DataManagerDocument_Factory;
import com.mifos.api.datamanager.DataManagerGroups;
import com.mifos.api.datamanager.DataManagerGroups_Factory;
import com.mifos.api.datamanager.DataManagerLoan;
import com.mifos.api.datamanager.DataManagerLoan_Factory;
import com.mifos.api.datamanager.DataManagerOffices;
import com.mifos.api.datamanager.DataManagerOffices_Factory;
import com.mifos.api.datamanager.DataManagerSavings;
import com.mifos.api.datamanager.DataManagerSavings_Factory;
import com.mifos.api.datamanager.DataManagerStaff;
import com.mifos.api.datamanager.DataManagerStaff_Factory;
import com.mifos.api.datamanager.DataManagerSurveys;
import com.mifos.api.datamanager.DataManagerSurveys_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperCenter;
import com.mifos.api.local.databasehelper.DatabaseHelperCenter_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperCharge;
import com.mifos.api.local.databasehelper.DatabaseHelperCharge_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperClient;
import com.mifos.api.local.databasehelper.DatabaseHelperClient_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperDataTable;
import com.mifos.api.local.databasehelper.DatabaseHelperDataTable_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperGroups;
import com.mifos.api.local.databasehelper.DatabaseHelperGroups_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperLoan;
import com.mifos.api.local.databasehelper.DatabaseHelperLoan_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperOffices;
import com.mifos.api.local.databasehelper.DatabaseHelperOffices_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperSavings;
import com.mifos.api.local.databasehelper.DatabaseHelperSavings_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperStaff;
import com.mifos.api.local.databasehelper.DatabaseHelperStaff_Factory;
import com.mifos.api.local.databasehelper.DatabaseHelperSurveys;
import com.mifos.api.local.databasehelper.DatabaseHelperSurveys_Factory;
import com.mifos.mifosxdroid.injection.module.ApplicationModule;
import com.mifos.mifosxdroid.injection.module.ApplicationModule_ProvideApplicationFactory;
import com.mifos.mifosxdroid.injection.module.ApplicationModule_ProvideBaseApiManagerFactory;
import com.mifos.mifosxdroid.injection.module.ApplicationModule_ProvideContextFactory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> provideContextProvider;

  private Provider<Application> provideApplicationProvider;

  private Provider<BaseApiManager> provideBaseApiManagerProvider;

  private Provider<DatabaseHelperClient> databaseHelperClientProvider;

  private Provider<DataManagerClient> dataManagerClientProvider;

  private Provider<DataManager> dataManagerProvider;

  private Provider<DatabaseHelperGroups> databaseHelperGroupsProvider;

  private Provider<DataManagerGroups> dataManagerGroupsProvider;

  private Provider<DatabaseHelperCenter> databaseHelperCenterProvider;

  private Provider<DataManagerCenter> dataManagerCenterProvider;

  private Provider<DatabaseHelperDataTable> databaseHelperDataTableProvider;

  private Provider<DataManagerDataTable> dataManagerDataTableProvider;

  private Provider<DatabaseHelperCharge> databaseHelperChargeProvider;

  private Provider<DataManagerCharge> dataManagerChargeProvider;

  private Provider<DatabaseHelperOffices> databaseHelperOfficesProvider;

  private Provider<DataManagerOffices> dataManagerOfficesProvider;

  private Provider<DatabaseHelperStaff> databaseHelperStaffProvider;

  private Provider<DataManagerStaff> dataManagerStaffProvider;

  private Provider<DatabaseHelperLoan> databaseHelperLoanProvider;

  private Provider<DataManagerLoan> dataManagerLoanProvider;

  private Provider<DatabaseHelperSavings> databaseHelperSavingsProvider;

  private Provider<DataManagerSavings> dataManagerSavingsProvider;

  private Provider<DatabaseHelperSurveys> databaseHelperSurveysProvider;

  private Provider<DataManagerSurveys> dataManagerSurveysProvider;

  private Provider<DataManagerDocument> dataManagerDocumentProvider;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideContextProvider =
        ApplicationModule_ProvideContextFactory.create(builder.applicationModule);

    this.provideApplicationProvider =
        ApplicationModule_ProvideApplicationFactory.create(builder.applicationModule);

    this.provideBaseApiManagerProvider =
        ScopedProvider.create(
            ApplicationModule_ProvideBaseApiManagerFactory.create(builder.applicationModule));

    this.databaseHelperClientProvider =
        ScopedProvider.create(DatabaseHelperClient_Factory.create());

    this.dataManagerClientProvider =
        ScopedProvider.create(
            DataManagerClient_Factory.create(
                provideBaseApiManagerProvider, databaseHelperClientProvider));

    this.dataManagerProvider =
        ScopedProvider.create(
            DataManager_Factory.create(provideBaseApiManagerProvider, dataManagerClientProvider));

    this.databaseHelperGroupsProvider =
        ScopedProvider.create(DatabaseHelperGroups_Factory.create());

    this.dataManagerGroupsProvider =
        ScopedProvider.create(
            DataManagerGroups_Factory.create(
                provideBaseApiManagerProvider,
                databaseHelperGroupsProvider,
                databaseHelperClientProvider));

    this.databaseHelperCenterProvider =
        ScopedProvider.create(DatabaseHelperCenter_Factory.create());

    this.dataManagerCenterProvider =
        ScopedProvider.create(
            DataManagerCenter_Factory.create(
                provideBaseApiManagerProvider, databaseHelperCenterProvider));

    this.databaseHelperDataTableProvider =
        ScopedProvider.create(DatabaseHelperDataTable_Factory.create());

    this.dataManagerDataTableProvider =
        ScopedProvider.create(
            DataManagerDataTable_Factory.create(
                provideBaseApiManagerProvider, databaseHelperDataTableProvider));

    this.databaseHelperChargeProvider =
        ScopedProvider.create(DatabaseHelperCharge_Factory.create());

    this.dataManagerChargeProvider =
        ScopedProvider.create(
            DataManagerCharge_Factory.create(
                provideBaseApiManagerProvider, databaseHelperChargeProvider));

    this.databaseHelperOfficesProvider =
        ScopedProvider.create(DatabaseHelperOffices_Factory.create());

    this.dataManagerOfficesProvider =
        ScopedProvider.create(
            DataManagerOffices_Factory.create(
                provideBaseApiManagerProvider, databaseHelperOfficesProvider));

    this.databaseHelperStaffProvider = ScopedProvider.create(DatabaseHelperStaff_Factory.create());

    this.dataManagerStaffProvider =
        ScopedProvider.create(
            DataManagerStaff_Factory.create(
                provideBaseApiManagerProvider, databaseHelperStaffProvider));

    this.databaseHelperLoanProvider = ScopedProvider.create(DatabaseHelperLoan_Factory.create());

    this.dataManagerLoanProvider =
        ScopedProvider.create(
            DataManagerLoan_Factory.create(
                provideBaseApiManagerProvider, databaseHelperLoanProvider));

    this.databaseHelperSavingsProvider =
        ScopedProvider.create(DatabaseHelperSavings_Factory.create());

    this.dataManagerSavingsProvider =
        ScopedProvider.create(
            DataManagerSavings_Factory.create(
                provideBaseApiManagerProvider, databaseHelperSavingsProvider));

    this.databaseHelperSurveysProvider =
        ScopedProvider.create(DatabaseHelperSurveys_Factory.create());

    this.dataManagerSurveysProvider =
        ScopedProvider.create(
            DataManagerSurveys_Factory.create(
                provideBaseApiManagerProvider, databaseHelperSurveysProvider));

    this.dataManagerDocumentProvider =
        ScopedProvider.create(DataManagerDocument_Factory.create(provideBaseApiManagerProvider));
  }

  @Override
  public Context context() {
    return provideContextProvider.get();
  }

  @Override
  public Application application() {
    return provideApplicationProvider.get();
  }

  @Override
  public DataManager dataManager() {
    return dataManagerProvider.get();
  }

  @Override
  public DataManagerClient dataManagerClient() {
    return dataManagerClientProvider.get();
  }

  @Override
  public DataManagerGroups dataManagerGroups() {
    return dataManagerGroupsProvider.get();
  }

  @Override
  public DataManagerCenter dataManagerCenters() {
    return dataManagerCenterProvider.get();
  }

  @Override
  public DataManagerDataTable dataManagerDataTable() {
    return dataManagerDataTableProvider.get();
  }

  @Override
  public DataManagerCharge dataManagerCharge() {
    return dataManagerChargeProvider.get();
  }

  @Override
  public DataManagerOffices dataManagerOffices() {
    return dataManagerOfficesProvider.get();
  }

  @Override
  public DataManagerStaff dataManagerStaff() {
    return dataManagerStaffProvider.get();
  }

  @Override
  public DataManagerLoan dataManagerLoan() {
    return dataManagerLoanProvider.get();
  }

  @Override
  public DataManagerSavings dataManagerSavings() {
    return dataManagerSavingsProvider.get();
  }

  @Override
  public DataManagerSurveys dataManagerSurveys() {
    return dataManagerSurveysProvider.get();
  }

  @Override
  public DataManagerDocument dataManagerDocument() {
    return dataManagerDocumentProvider.get();
  }

  @Override
  public DatabaseHelperClient databaseHelperClient() {
    return databaseHelperClientProvider.get();
  }

  @Override
  public DatabaseHelperCenter databaseHelperCenter() {
    return databaseHelperCenterProvider.get();
  }

  @Override
  public DatabaseHelperGroups databaseHelperGroup() {
    return databaseHelperGroupsProvider.get();
  }

  @Override
  public DatabaseHelperDataTable databaseHelperDataTable() {
    return databaseHelperDataTableProvider.get();
  }

  @Override
  public DatabaseHelperCharge databaseHelperCharge() {
    return databaseHelperChargeProvider.get();
  }

  @Override
  public DatabaseHelperOffices databaseHelperOffices() {
    return databaseHelperOfficesProvider.get();
  }

  @Override
  public DatabaseHelperStaff databaseHelperStaff() {
    return databaseHelperStaffProvider.get();
  }

  @Override
  public DatabaseHelperLoan databaseHelperLoan() {
    return databaseHelperLoanProvider.get();
  }

  @Override
  public DatabaseHelperSavings databaseHelperSavings() {
    return databaseHelperSavingsProvider.get();
  }

  @Override
  public DatabaseHelperSurveys databaseHelperSurveys() {
    return databaseHelperSurveysProvider.get();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }
  }
}
