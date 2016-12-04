package com.mifos.mifosxdroid.injection.component;

import com.mifos.api.DataManager;
import com.mifos.api.datamanager.DataManagerCenter;
import com.mifos.api.datamanager.DataManagerCharge;
import com.mifos.api.datamanager.DataManagerClient;
import com.mifos.api.datamanager.DataManagerDataTable;
import com.mifos.api.datamanager.DataManagerDocument;
import com.mifos.api.datamanager.DataManagerGroups;
import com.mifos.api.datamanager.DataManagerLoan;
import com.mifos.api.datamanager.DataManagerOffices;
import com.mifos.api.datamanager.DataManagerSavings;
import com.mifos.api.datamanager.DataManagerStaff;
import com.mifos.api.datamanager.DataManagerSurveys;
import com.mifos.mifosxdroid.activity.pinpointclient.PinPointClientPresenter;
import com.mifos.mifosxdroid.activity.pinpointclient.PinPointClientPresenter_Factory;
import com.mifos.mifosxdroid.activity.pinpointclient.PinpointClientActivity;
import com.mifos.mifosxdroid.activity.pinpointclient.PinpointClientActivity_MembersInjector;
import com.mifos.mifosxdroid.adapters.CentersListAdapter;
import com.mifos.mifosxdroid.adapters.CentersListAdapter_Factory;
import com.mifos.mifosxdroid.adapters.ClientNameListAdapter;
import com.mifos.mifosxdroid.adapters.ClientNameListAdapter_Factory;
import com.mifos.mifosxdroid.adapters.DocumentListAdapter;
import com.mifos.mifosxdroid.adapters.DocumentListAdapter_Factory;
import com.mifos.mifosxdroid.adapters.GroupNameListAdapter;
import com.mifos.mifosxdroid.adapters.GroupNameListAdapter_Factory;
import com.mifos.mifosxdroid.adapters.IdentifierListAdapter;
import com.mifos.mifosxdroid.adapters.IdentifierListAdapter_Factory;
import com.mifos.mifosxdroid.adapters.OfflineDashboardAdapter;
import com.mifos.mifosxdroid.adapters.OfflineDashboardAdapter_Factory;
import com.mifos.mifosxdroid.adapters.SyncGroupPayloadAdapter;
import com.mifos.mifosxdroid.adapters.SyncGroupPayloadAdapter_Factory;
import com.mifos.mifosxdroid.adapters.SyncLoanRepaymentAdapter;
import com.mifos.mifosxdroid.adapters.SyncLoanRepaymentAdapter_Factory;
import com.mifos.mifosxdroid.adapters.SyncSavingsAccountTransactionAdapter;
import com.mifos.mifosxdroid.adapters.SyncSavingsAccountTransactionAdapter_Factory;
import com.mifos.mifosxdroid.dialogfragments.chargedialog.ChargeDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.chargedialog.ChargeDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.chargedialog.ChargeDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.chargedialog.ChargeDialogPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.datatablerowdialog.DataTableRowDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.datatablerowdialog.DataTableRowDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.datatablerowdialog.DataTableRowDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.datatablerowdialog.DataTableRowDialogPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.documentdialog.DocumentDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.documentdialog.DocumentDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.documentdialog.DocumentDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.documentdialog.DocumentDialogPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.identifierdialog.IdentifierDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.identifierdialog.IdentifierDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.identifierdialog.IdentifierDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.identifierdialog.IdentifierDialogPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.loanaccountapproval.LoanAccountApproval;
import com.mifos.mifosxdroid.dialogfragments.loanaccountapproval.LoanAccountApprovalPresenter;
import com.mifos.mifosxdroid.dialogfragments.loanaccountapproval.LoanAccountApprovalPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.loanaccountapproval.LoanAccountApproval_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement.LoanAccountDisbursement;
import com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement.LoanAccountDisbursementPresenter;
import com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement.LoanAccountDisbursementPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.loanaccountdisbursement.LoanAccountDisbursement_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.loanchargedialog.LoanChargeDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.loanchargedialog.LoanChargeDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.loanchargedialog.LoanChargeDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.loanchargedialog.LoanChargeDialogPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval.SavingsAccountApproval;
import com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval.SavingsAccountApprovalPresenter;
import com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval.SavingsAccountApprovalPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.savingsaccountapproval.SavingsAccountApproval_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.syncclientsdialog.SyncClientsDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.syncclientsdialog.SyncClientsDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.syncclientsdialog.SyncClientsDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.syncclientsdialog.SyncClientsDialogPresenter_Factory;
import com.mifos.mifosxdroid.dialogfragments.syncgroupsdialog.SyncGroupsDialogFragment;
import com.mifos.mifosxdroid.dialogfragments.syncgroupsdialog.SyncGroupsDialogFragment_MembersInjector;
import com.mifos.mifosxdroid.dialogfragments.syncgroupsdialog.SyncGroupsDialogPresenter;
import com.mifos.mifosxdroid.dialogfragments.syncgroupsdialog.SyncGroupsDialogPresenter_Factory;
import com.mifos.mifosxdroid.injection.module.ActivityModule;
import com.mifos.mifosxdroid.login.LoginActivity;
import com.mifos.mifosxdroid.login.LoginActivity_MembersInjector;
import com.mifos.mifosxdroid.login.LoginPresenter;
import com.mifos.mifosxdroid.login.LoginPresenter_Factory;
import com.mifos.mifosxdroid.offline.offlinedashbarod.OfflineDashboardFragment;
import com.mifos.mifosxdroid.offline.offlinedashbarod.OfflineDashboardFragment_MembersInjector;
import com.mifos.mifosxdroid.offline.offlinedashbarod.OfflineDashboardPresenter;
import com.mifos.mifosxdroid.offline.offlinedashbarod.OfflineDashboardPresenter_Factory;
import com.mifos.mifosxdroid.offline.syncclientpayloads.SyncClientPayloadsFragment;
import com.mifos.mifosxdroid.offline.syncclientpayloads.SyncClientPayloadsFragment_MembersInjector;
import com.mifos.mifosxdroid.offline.syncclientpayloads.SyncClientPayloadsPresenter;
import com.mifos.mifosxdroid.offline.syncclientpayloads.SyncClientPayloadsPresenter_Factory;
import com.mifos.mifosxdroid.offline.syncgrouppayloads.SyncGroupPayloadsFragment;
import com.mifos.mifosxdroid.offline.syncgrouppayloads.SyncGroupPayloadsFragment_MembersInjector;
import com.mifos.mifosxdroid.offline.syncgrouppayloads.SyncGroupPayloadsPresenter;
import com.mifos.mifosxdroid.offline.syncgrouppayloads.SyncGroupPayloadsPresenter_Factory;
import com.mifos.mifosxdroid.offline.syncloanrepaymenttransacition.SyncLoanRepaymentTransactionFragment;
import com.mifos.mifosxdroid.offline.syncloanrepaymenttransacition.SyncLoanRepaymentTransactionFragment_MembersInjector;
import com.mifos.mifosxdroid.offline.syncloanrepaymenttransacition.SyncLoanRepaymentTransactionPresenter;
import com.mifos.mifosxdroid.offline.syncloanrepaymenttransacition.SyncLoanRepaymentTransactionPresenter_Factory;
import com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction.SyncSavingsAccountTransactionFragment;
import com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction.SyncSavingsAccountTransactionFragment_MembersInjector;
import com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction.SyncSavingsAccountTransactionPresenter;
import com.mifos.mifosxdroid.offline.syncsavingsaccounttransaction.SyncSavingsAccountTransactionPresenter_Factory;
import com.mifos.mifosxdroid.online.centerlist.CenterListFragment;
import com.mifos.mifosxdroid.online.centerlist.CenterListFragment_MembersInjector;
import com.mifos.mifosxdroid.online.centerlist.CenterListPresenter;
import com.mifos.mifosxdroid.online.centerlist.CenterListPresenter_Factory;
import com.mifos.mifosxdroid.online.clientcharge.ClientChargeFragment;
import com.mifos.mifosxdroid.online.clientcharge.ClientChargeFragment_MembersInjector;
import com.mifos.mifosxdroid.online.clientcharge.ClientChargePresenter;
import com.mifos.mifosxdroid.online.clientcharge.ClientChargePresenter_Factory;
import com.mifos.mifosxdroid.online.clientdetails.ClientDetailsFragment;
import com.mifos.mifosxdroid.online.clientdetails.ClientDetailsFragment_MembersInjector;
import com.mifos.mifosxdroid.online.clientdetails.ClientDetailsPresenter;
import com.mifos.mifosxdroid.online.clientdetails.ClientDetailsPresenter_Factory;
import com.mifos.mifosxdroid.online.clientidentifiers.ClientIdentifiersFragment;
import com.mifos.mifosxdroid.online.clientidentifiers.ClientIdentifiersFragment_MembersInjector;
import com.mifos.mifosxdroid.online.clientidentifiers.ClientIdentifiersPresenter;
import com.mifos.mifosxdroid.online.clientidentifiers.ClientIdentifiersPresenter_Factory;
import com.mifos.mifosxdroid.online.clientlist.ClientListFragment;
import com.mifos.mifosxdroid.online.clientlist.ClientListFragment_MembersInjector;
import com.mifos.mifosxdroid.online.clientlist.ClientListPresenter;
import com.mifos.mifosxdroid.online.clientlist.ClientListPresenter_Factory;
import com.mifos.mifosxdroid.online.clientsearch.ClientSearchFragment;
import com.mifos.mifosxdroid.online.clientsearch.ClientSearchFragment_MembersInjector;
import com.mifos.mifosxdroid.online.clientsearch.ClientSearchPresenter;
import com.mifos.mifosxdroid.online.clientsearch.ClientSearchPresenter_Factory;
import com.mifos.mifosxdroid.online.collectionsheet.CollectionSheetFragment;
import com.mifos.mifosxdroid.online.collectionsheet.CollectionSheetFragment_MembersInjector;
import com.mifos.mifosxdroid.online.collectionsheet.CollectionSheetPresenter;
import com.mifos.mifosxdroid.online.collectionsheet.CollectionSheetPresenter_Factory;
import com.mifos.mifosxdroid.online.createnewcenter.CreateNewCenterFragment;
import com.mifos.mifosxdroid.online.createnewcenter.CreateNewCenterFragment_MembersInjector;
import com.mifos.mifosxdroid.online.createnewcenter.CreateNewCenterPresenter;
import com.mifos.mifosxdroid.online.createnewcenter.CreateNewCenterPresenter_Factory;
import com.mifos.mifosxdroid.online.createnewclient.CreateNewClientFragment;
import com.mifos.mifosxdroid.online.createnewclient.CreateNewClientFragment_MembersInjector;
import com.mifos.mifosxdroid.online.createnewclient.CreateNewClientPresenter;
import com.mifos.mifosxdroid.online.createnewclient.CreateNewClientPresenter_Factory;
import com.mifos.mifosxdroid.online.createnewgroup.CreateNewGroupFragment;
import com.mifos.mifosxdroid.online.createnewgroup.CreateNewGroupFragment_MembersInjector;
import com.mifos.mifosxdroid.online.createnewgroup.CreateNewGroupPresenter;
import com.mifos.mifosxdroid.online.createnewgroup.CreateNewGroupPresenter_Factory;
import com.mifos.mifosxdroid.online.datatabledata.DataTableDataFragment;
import com.mifos.mifosxdroid.online.datatabledata.DataTableDataFragment_MembersInjector;
import com.mifos.mifosxdroid.online.datatabledata.DataTableDataPresenter;
import com.mifos.mifosxdroid.online.datatabledata.DataTableDataPresenter_Factory;
import com.mifos.mifosxdroid.online.documentlist.DocumentListFragment;
import com.mifos.mifosxdroid.online.documentlist.DocumentListFragment_MembersInjector;
import com.mifos.mifosxdroid.online.documentlist.DocumentListPresenter;
import com.mifos.mifosxdroid.online.documentlist.DocumentListPresenter_Factory;
import com.mifos.mifosxdroid.online.generatecollectionsheet.GenerateCollectionSheetFragment;
import com.mifos.mifosxdroid.online.generatecollectionsheet.GenerateCollectionSheetFragment_MembersInjector;
import com.mifos.mifosxdroid.online.generatecollectionsheet.GenerateCollectionSheetPresenter;
import com.mifos.mifosxdroid.online.generatecollectionsheet.GenerateCollectionSheetPresenter_Factory;
import com.mifos.mifosxdroid.online.groupdetails.GroupDetailsFragment;
import com.mifos.mifosxdroid.online.groupdetails.GroupDetailsFragment_MembersInjector;
import com.mifos.mifosxdroid.online.groupdetails.GroupDetailsPresenter;
import com.mifos.mifosxdroid.online.groupdetails.GroupDetailsPresenter_Factory;
import com.mifos.mifosxdroid.online.grouplist.GroupListFragment;
import com.mifos.mifosxdroid.online.grouplist.GroupListFragment_MembersInjector;
import com.mifos.mifosxdroid.online.grouplist.GroupListPresenter;
import com.mifos.mifosxdroid.online.grouplist.GroupListPresenter_Factory;
import com.mifos.mifosxdroid.online.grouploanaccount.GroupLoanAccountFragment;
import com.mifos.mifosxdroid.online.grouploanaccount.GroupLoanAccountFragment_MembersInjector;
import com.mifos.mifosxdroid.online.grouploanaccount.GroupLoanAccountPresenter;
import com.mifos.mifosxdroid.online.grouploanaccount.GroupLoanAccountPresenter_Factory;
import com.mifos.mifosxdroid.online.groupslist.GroupsListFragment;
import com.mifos.mifosxdroid.online.groupslist.GroupsListFragment_MembersInjector;
import com.mifos.mifosxdroid.online.groupslist.GroupsListPresenter;
import com.mifos.mifosxdroid.online.groupslist.GroupsListPresenter_Factory;
import com.mifos.mifosxdroid.online.loanaccount.LoanAccountFragment;
import com.mifos.mifosxdroid.online.loanaccount.LoanAccountFragment_MembersInjector;
import com.mifos.mifosxdroid.online.loanaccount.LoanAccountPresenter;
import com.mifos.mifosxdroid.online.loanaccount.LoanAccountPresenter_Factory;
import com.mifos.mifosxdroid.online.loanaccountsummary.LoanAccountSummaryFragment;
import com.mifos.mifosxdroid.online.loanaccountsummary.LoanAccountSummaryFragment_MembersInjector;
import com.mifos.mifosxdroid.online.loanaccountsummary.LoanAccountSummaryPresenter;
import com.mifos.mifosxdroid.online.loanaccountsummary.LoanAccountSummaryPresenter_Factory;
import com.mifos.mifosxdroid.online.loancharge.LoanChargeFragment;
import com.mifos.mifosxdroid.online.loancharge.LoanChargeFragment_MembersInjector;
import com.mifos.mifosxdroid.online.loancharge.LoanChargePresenter;
import com.mifos.mifosxdroid.online.loancharge.LoanChargePresenter_Factory;
import com.mifos.mifosxdroid.online.loanrepayment.LoanRepaymentFragment;
import com.mifos.mifosxdroid.online.loanrepayment.LoanRepaymentFragment_MembersInjector;
import com.mifos.mifosxdroid.online.loanrepayment.LoanRepaymentPresenter;
import com.mifos.mifosxdroid.online.loanrepayment.LoanRepaymentPresenter_Factory;
import com.mifos.mifosxdroid.online.loanrepaymentschedule.LoanRepaymentScheduleFragment;
import com.mifos.mifosxdroid.online.loanrepaymentschedule.LoanRepaymentScheduleFragment_MembersInjector;
import com.mifos.mifosxdroid.online.loanrepaymentschedule.LoanRepaymentSchedulePresenter;
import com.mifos.mifosxdroid.online.loanrepaymentschedule.LoanRepaymentSchedulePresenter_Factory;
import com.mifos.mifosxdroid.online.loantransactions.LoanTransactionsFragment;
import com.mifos.mifosxdroid.online.loantransactions.LoanTransactionsFragment_MembersInjector;
import com.mifos.mifosxdroid.online.loantransactions.LoanTransactionsPresenter;
import com.mifos.mifosxdroid.online.loantransactions.LoanTransactionsPresenter_Factory;
import com.mifos.mifosxdroid.online.savingaccountsummary.SavingsAccountSummaryFragment;
import com.mifos.mifosxdroid.online.savingaccountsummary.SavingsAccountSummaryFragment_MembersInjector;
import com.mifos.mifosxdroid.online.savingaccountsummary.SavingsAccountSummaryPresenter;
import com.mifos.mifosxdroid.online.savingaccountsummary.SavingsAccountSummaryPresenter_Factory;
import com.mifos.mifosxdroid.online.savingaccounttransaction.SavingsAccountTransactionFragment;
import com.mifos.mifosxdroid.online.savingaccounttransaction.SavingsAccountTransactionFragment_MembersInjector;
import com.mifos.mifosxdroid.online.savingaccounttransaction.SavingsAccountTransactionPresenter;
import com.mifos.mifosxdroid.online.savingaccounttransaction.SavingsAccountTransactionPresenter_Factory;
import com.mifos.mifosxdroid.online.savingsaccount.SavingsAccountFragment;
import com.mifos.mifosxdroid.online.savingsaccount.SavingsAccountFragment_MembersInjector;
import com.mifos.mifosxdroid.online.savingsaccount.SavingsAccountPresenter;
import com.mifos.mifosxdroid.online.savingsaccount.SavingsAccountPresenter_Factory;
import com.mifos.mifosxdroid.online.surveylist.SurveyListFragment;
import com.mifos.mifosxdroid.online.surveylist.SurveyListFragment_MembersInjector;
import com.mifos.mifosxdroid.online.surveylist.SurveyListPresenter;
import com.mifos.mifosxdroid.online.surveylist.SurveyListPresenter_Factory;
import com.mifos.mifosxdroid.online.surveysubmit.SurveySubmitFragment;
import com.mifos.mifosxdroid.online.surveysubmit.SurveySubmitFragment_MembersInjector;
import com.mifos.mifosxdroid.online.surveysubmit.SurveySubmitPresenter;
import com.mifos.mifosxdroid.online.surveysubmit.SurveySubmitPresenter_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> dataManagerProvider;

  private Provider<LoginPresenter> loginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<DataManagerCenter> dataManagerCentersProvider;

  private Provider<CenterListPresenter> centerListPresenterProvider;

  private Provider<CentersListAdapter> centersListAdapterProvider;

  private MembersInjector<CenterListFragment> centerListFragmentMembersInjector;

  private Provider<DataManagerCharge> dataManagerChargeProvider;

  private Provider<ClientChargePresenter> clientChargePresenterProvider;

  private MembersInjector<ClientChargeFragment> clientChargeFragmentMembersInjector;

  private Provider<ClientNameListAdapter> clientNameListAdapterProvider;

  private Provider<DataManagerClient> dataManagerClientProvider;

  private Provider<ClientListPresenter> clientListPresenterProvider;

  private MembersInjector<ClientListFragment> clientListFragmentMembersInjector;

  private Provider<ClientIdentifiersPresenter> clientIdentifiersPresenterProvider;

  private Provider<IdentifierListAdapter> identifierListAdapterProvider;

  private MembersInjector<ClientIdentifiersFragment> clientIdentifiersFragmentMembersInjector;

  private Provider<ClientSearchPresenter> clientSearchPresenterProvider;

  private MembersInjector<ClientSearchFragment> clientSearchFragmentMembersInjector;

  private Provider<DataManagerDocument> dataManagerDocumentProvider;

  private Provider<DocumentListPresenter> documentListPresenterProvider;

  private Provider<DocumentListAdapter> documentListAdapterProvider;

  private MembersInjector<DocumentListFragment> documentListFragmentMembersInjector;

  private Provider<GroupListPresenter> groupListPresenterProvider;

  private MembersInjector<GroupListFragment> groupListFragmentMembersInjector;

  private Provider<GenerateCollectionSheetPresenter> generateCollectionSheetPresenterProvider;

  private MembersInjector<GenerateCollectionSheetFragment>
      generateCollectionSheetFragmentMembersInjector;

  private Provider<CreateNewCenterPresenter> createNewCenterPresenterProvider;

  private MembersInjector<CreateNewCenterFragment> createNewCenterFragmentMembersInjector;

  private Provider<DataManagerOffices> dataManagerOfficesProvider;

  private Provider<DataManagerGroups> dataManagerGroupsProvider;

  private Provider<CreateNewGroupPresenter> createNewGroupPresenterProvider;

  private MembersInjector<CreateNewGroupFragment> createNewGroupFragmentMembersInjector;

  private Provider<DataManagerStaff> dataManagerStaffProvider;

  private Provider<CreateNewClientPresenter> createNewClientPresenterProvider;

  private MembersInjector<CreateNewClientFragment> createNewClientFragmentMembersInjector;

  private Provider<DataTableDataPresenter> dataTableDataPresenterProvider;

  private MembersInjector<DataTableDataFragment> dataTableDataFragmentMembersInjector;

  private Provider<DataManagerDataTable> dataManagerDataTableProvider;

  private Provider<GroupDetailsPresenter> groupDetailsPresenterProvider;

  private MembersInjector<GroupDetailsFragment> groupDetailsFragmentMembersInjector;

  private Provider<ClientDetailsPresenter> clientDetailsPresenterProvider;

  private MembersInjector<ClientDetailsFragment> clientDetailsFragmentMembersInjector;

  private Provider<DataManagerLoan> dataManagerLoanProvider;

  private Provider<LoanAccountSummaryPresenter> loanAccountSummaryPresenterProvider;

  private MembersInjector<LoanAccountSummaryFragment> loanAccountSummaryFragmentMembersInjector;

  private Provider<DataManagerSavings> dataManagerSavingsProvider;

  private Provider<SavingsAccountSummaryPresenter> savingsAccountSummaryPresenterProvider;

  private MembersInjector<SavingsAccountSummaryFragment>
      savingsAccountSummaryFragmentMembersInjector;

  private Provider<LoanChargePresenter> loanChargePresenterProvider;

  private MembersInjector<LoanChargeFragment> loanChargeFragmentMembersInjector;

  private Provider<SavingsAccountTransactionPresenter> savingsAccountTransactionPresenterProvider;

  private MembersInjector<SavingsAccountTransactionFragment>
      savingsAccountTransactionFragmentMembersInjector;

  private Provider<CollectionSheetPresenter> collectionSheetPresenterProvider;

  private MembersInjector<CollectionSheetFragment> collectionSheetFragmentMembersInjector;

  private Provider<GroupsListPresenter> groupsListPresenterProvider;

  private Provider<GroupNameListAdapter> groupNameListAdapterProvider;

  private MembersInjector<GroupsListFragment> groupsListFragmentMembersInjector;

  private Provider<LoanTransactionsPresenter> loanTransactionsPresenterProvider;

  private MembersInjector<LoanTransactionsFragment> loanTransactionsFragmentMembersInjector;

  private Provider<SavingsAccountPresenter> savingsAccountPresenterProvider;

  private MembersInjector<SavingsAccountFragment> savingsAccountFragmentMembersInjector;

  private Provider<LoanRepaymentPresenter> loanRepaymentPresenterProvider;

  private MembersInjector<LoanRepaymentFragment> loanRepaymentFragmentMembersInjector;

  private Provider<GroupLoanAccountPresenter> groupLoanAccountPresenterProvider;

  private MembersInjector<GroupLoanAccountFragment> groupLoanAccountFragmentMembersInjector;

  private Provider<LoanAccountPresenter> loanAccountPresenterProvider;

  private MembersInjector<LoanAccountFragment> loanAccountFragmentMembersInjector;

  private Provider<LoanRepaymentSchedulePresenter> loanRepaymentSchedulePresenterProvider;

  private MembersInjector<LoanRepaymentScheduleFragment>
      loanRepaymentScheduleFragmentMembersInjector;

  private Provider<DataManagerSurveys> dataManagerSurveysProvider;

  private Provider<SurveyListPresenter> surveyListPresenterProvider;

  private MembersInjector<SurveyListFragment> surveyListFragmentMembersInjector;

  private Provider<SurveySubmitPresenter> surveySubmitPresenterProvider;

  private MembersInjector<SurveySubmitFragment> surveySubmitFragmentMembersInjector;

  private Provider<PinPointClientPresenter> pinPointClientPresenterProvider;

  private MembersInjector<PinpointClientActivity> pinpointClientActivityMembersInjector;

  private Provider<ChargeDialogPresenter> chargeDialogPresenterProvider;

  private MembersInjector<ChargeDialogFragment> chargeDialogFragmentMembersInjector;

  private Provider<DataTableRowDialogPresenter> dataTableRowDialogPresenterProvider;

  private MembersInjector<DataTableRowDialogFragment> dataTableRowDialogFragmentMembersInjector;

  private Provider<DocumentDialogPresenter> documentDialogPresenterProvider;

  private MembersInjector<DocumentDialogFragment> documentDialogFragmentMembersInjector;

  private Provider<LoanAccountApprovalPresenter> loanAccountApprovalPresenterProvider;

  private MembersInjector<LoanAccountApproval> loanAccountApprovalMembersInjector;

  private Provider<LoanAccountDisbursementPresenter> loanAccountDisbursementPresenterProvider;

  private MembersInjector<LoanAccountDisbursement> loanAccountDisbursementMembersInjector;

  private Provider<LoanChargeDialogPresenter> loanChargeDialogPresenterProvider;

  private MembersInjector<LoanChargeDialogFragment> loanChargeDialogFragmentMembersInjector;

  private Provider<SavingsAccountApprovalPresenter> savingsAccountApprovalPresenterProvider;

  private MembersInjector<SavingsAccountApproval> savingsAccountApprovalMembersInjector;

  private Provider<SyncClientPayloadsPresenter> syncClientPayloadsPresenterProvider;

  private MembersInjector<SyncClientPayloadsFragment> syncClientPayloadsFragmentMembersInjector;

  private Provider<SyncGroupPayloadsPresenter> syncGroupPayloadsPresenterProvider;

  private Provider<SyncGroupPayloadAdapter> syncGroupPayloadAdapterProvider;

  private MembersInjector<SyncGroupPayloadsFragment> syncGroupPayloadsFragmentMembersInjector;

  private Provider<OfflineDashboardPresenter> offlineDashboardPresenterProvider;

  private Provider<OfflineDashboardAdapter> offlineDashboardAdapterProvider;

  private MembersInjector<OfflineDashboardFragment> offlineDashboardFragmentMembersInjector;

  private Provider<SyncLoanRepaymentTransactionPresenter>
      syncLoanRepaymentTransactionPresenterProvider;

  private Provider<SyncLoanRepaymentAdapter> syncLoanRepaymentAdapterProvider;

  private MembersInjector<SyncLoanRepaymentTransactionFragment>
      syncLoanRepaymentTransactionFragmentMembersInjector;

  private Provider<SyncClientsDialogPresenter> syncClientsDialogPresenterProvider;

  private MembersInjector<SyncClientsDialogFragment> syncClientsDialogFragmentMembersInjector;

  private Provider<SyncSavingsAccountTransactionPresenter>
      syncSavingsAccountTransactionPresenterProvider;

  private Provider<SyncSavingsAccountTransactionAdapter>
      syncSavingsAccountTransactionAdapterProvider;

  private MembersInjector<SyncSavingsAccountTransactionFragment>
      syncSavingsAccountTransactionFragmentMembersInjector;

  private Provider<SyncGroupsDialogPresenter> syncGroupsDialogPresenterProvider;

  private MembersInjector<SyncGroupsDialogFragment> syncGroupsDialogFragmentMembersInjector;

  private Provider<IdentifierDialogPresenter> identifierDialogPresenterProvider;

  private MembersInjector<IdentifierDialogFragment> identifierDialogFragmentMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
    initialize2(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.dataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.loginPresenterProvider = LoginPresenter_Factory.create(dataManagerProvider);

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(loginPresenterProvider);

    this.dataManagerCentersProvider =
        new Factory<DataManagerCenter>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerCenter get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerCenters(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.centerListPresenterProvider =
        CenterListPresenter_Factory.create(
            MembersInjectors.<CenterListPresenter>noOp(), dataManagerCentersProvider);

    this.centersListAdapterProvider =
        CentersListAdapter_Factory.create(MembersInjectors.<CentersListAdapter>noOp());

    this.centerListFragmentMembersInjector =
        CenterListFragment_MembersInjector.create(
            centerListPresenterProvider, centersListAdapterProvider);

    this.dataManagerChargeProvider =
        new Factory<DataManagerCharge>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerCharge get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerCharge(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.clientChargePresenterProvider =
        ClientChargePresenter_Factory.create(
            MembersInjectors.<ClientChargePresenter>noOp(), dataManagerChargeProvider);

    this.clientChargeFragmentMembersInjector =
        ClientChargeFragment_MembersInjector.create(clientChargePresenterProvider);

    this.clientNameListAdapterProvider =
        ClientNameListAdapter_Factory.create(MembersInjectors.<ClientNameListAdapter>noOp());

    this.dataManagerClientProvider =
        new Factory<DataManagerClient>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerClient get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerClient(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.clientListPresenterProvider =
        ClientListPresenter_Factory.create(
            MembersInjectors.<ClientListPresenter>noOp(), dataManagerClientProvider);

    this.clientListFragmentMembersInjector =
        ClientListFragment_MembersInjector.create(
            clientNameListAdapterProvider, clientListPresenterProvider);

    this.clientIdentifiersPresenterProvider =
        ClientIdentifiersPresenter_Factory.create(
            MembersInjectors.<ClientIdentifiersPresenter>noOp(), dataManagerClientProvider);

    this.identifierListAdapterProvider =
        IdentifierListAdapter_Factory.create(MembersInjectors.<IdentifierListAdapter>noOp());

    this.clientIdentifiersFragmentMembersInjector =
        ClientIdentifiersFragment_MembersInjector.create(
            clientIdentifiersPresenterProvider, identifierListAdapterProvider);

    this.clientSearchPresenterProvider =
        ClientSearchPresenter_Factory.create(
            MembersInjectors.<ClientSearchPresenter>noOp(), dataManagerProvider);

    this.clientSearchFragmentMembersInjector =
        ClientSearchFragment_MembersInjector.create(clientSearchPresenterProvider);

    this.dataManagerDocumentProvider =
        new Factory<DataManagerDocument>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerDocument get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerDocument(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.documentListPresenterProvider =
        DocumentListPresenter_Factory.create(
            MembersInjectors.<DocumentListPresenter>noOp(), dataManagerDocumentProvider);

    this.documentListAdapterProvider =
        DocumentListAdapter_Factory.create(MembersInjectors.<DocumentListAdapter>noOp());

    this.documentListFragmentMembersInjector =
        DocumentListFragment_MembersInjector.create(
            documentListPresenterProvider, documentListAdapterProvider);

    this.groupListPresenterProvider =
        GroupListPresenter_Factory.create(
            MembersInjectors.<GroupListPresenter>noOp(), dataManagerProvider);

    this.groupListFragmentMembersInjector =
        GroupListFragment_MembersInjector.create(groupListPresenterProvider);

    this.generateCollectionSheetPresenterProvider =
        GenerateCollectionSheetPresenter_Factory.create(
            MembersInjectors.<GenerateCollectionSheetPresenter>noOp(), dataManagerProvider);

    this.generateCollectionSheetFragmentMembersInjector =
        GenerateCollectionSheetFragment_MembersInjector.create(
            generateCollectionSheetPresenterProvider);

    this.createNewCenterPresenterProvider =
        CreateNewCenterPresenter_Factory.create(
            MembersInjectors.<CreateNewCenterPresenter>noOp(), dataManagerProvider);

    this.createNewCenterFragmentMembersInjector =
        CreateNewCenterFragment_MembersInjector.create(createNewCenterPresenterProvider);

    this.dataManagerOfficesProvider =
        new Factory<DataManagerOffices>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerOffices get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerOffices(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.dataManagerGroupsProvider =
        new Factory<DataManagerGroups>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerGroups get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerGroups(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.createNewGroupPresenterProvider =
        CreateNewGroupPresenter_Factory.create(
            MembersInjectors.<CreateNewGroupPresenter>noOp(),
            dataManagerOfficesProvider,
            dataManagerGroupsProvider);

    this.createNewGroupFragmentMembersInjector =
        CreateNewGroupFragment_MembersInjector.create(createNewGroupPresenterProvider);

    this.dataManagerStaffProvider =
        new Factory<DataManagerStaff>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerStaff get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerStaff(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.createNewClientPresenterProvider =
        CreateNewClientPresenter_Factory.create(
            MembersInjectors.<CreateNewClientPresenter>noOp(),
            dataManagerClientProvider,
            dataManagerOfficesProvider,
            dataManagerStaffProvider);

    this.createNewClientFragmentMembersInjector =
        CreateNewClientFragment_MembersInjector.create(createNewClientPresenterProvider);

    this.dataTableDataPresenterProvider =
        DataTableDataPresenter_Factory.create(
            MembersInjectors.<DataTableDataPresenter>noOp(), dataManagerProvider);

    this.dataTableDataFragmentMembersInjector =
        DataTableDataFragment_MembersInjector.create(dataTableDataPresenterProvider);

    this.dataManagerDataTableProvider =
        new Factory<DataManagerDataTable>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerDataTable get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerDataTable(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.groupDetailsPresenterProvider =
        GroupDetailsPresenter_Factory.create(
            MembersInjectors.<GroupDetailsPresenter>noOp(),
            dataManagerGroupsProvider,
            dataManagerDataTableProvider);

    this.groupDetailsFragmentMembersInjector =
        GroupDetailsFragment_MembersInjector.create(groupDetailsPresenterProvider);

    this.clientDetailsPresenterProvider =
        ClientDetailsPresenter_Factory.create(
            MembersInjectors.<ClientDetailsPresenter>noOp(),
            dataManagerDataTableProvider,
            dataManagerClientProvider);

    this.clientDetailsFragmentMembersInjector =
        ClientDetailsFragment_MembersInjector.create(clientDetailsPresenterProvider);

    this.dataManagerLoanProvider =
        new Factory<DataManagerLoan>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerLoan get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerLoan(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.loanAccountSummaryPresenterProvider =
        LoanAccountSummaryPresenter_Factory.create(
            MembersInjectors.<LoanAccountSummaryPresenter>noOp(),
            dataManagerLoanProvider,
            dataManagerDataTableProvider);

    this.loanAccountSummaryFragmentMembersInjector =
        LoanAccountSummaryFragment_MembersInjector.create(loanAccountSummaryPresenterProvider);

    this.dataManagerSavingsProvider =
        new Factory<DataManagerSavings>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerSavings get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerSavings(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.savingsAccountSummaryPresenterProvider =
        SavingsAccountSummaryPresenter_Factory.create(
            MembersInjectors.<SavingsAccountSummaryPresenter>noOp(),
            dataManagerDataTableProvider,
            dataManagerSavingsProvider);

    this.savingsAccountSummaryFragmentMembersInjector =
        SavingsAccountSummaryFragment_MembersInjector.create(
            savingsAccountSummaryPresenterProvider);

    this.loanChargePresenterProvider =
        LoanChargePresenter_Factory.create(
            MembersInjectors.<LoanChargePresenter>noOp(), dataManagerProvider);

    this.loanChargeFragmentMembersInjector =
        LoanChargeFragment_MembersInjector.create(loanChargePresenterProvider);

    this.savingsAccountTransactionPresenterProvider =
        SavingsAccountTransactionPresenter_Factory.create(
            MembersInjectors.<SavingsAccountTransactionPresenter>noOp(),
            dataManagerSavingsProvider);

    this.savingsAccountTransactionFragmentMembersInjector =
        SavingsAccountTransactionFragment_MembersInjector.create(
            savingsAccountTransactionPresenterProvider);

    this.collectionSheetPresenterProvider =
        CollectionSheetPresenter_Factory.create(
            MembersInjectors.<CollectionSheetPresenter>noOp(), dataManagerProvider);

    this.collectionSheetFragmentMembersInjector =
        CollectionSheetFragment_MembersInjector.create(collectionSheetPresenterProvider);

    this.groupsListPresenterProvider =
        GroupsListPresenter_Factory.create(
            MembersInjectors.<GroupsListPresenter>noOp(), dataManagerGroupsProvider);

    this.groupNameListAdapterProvider =
        GroupNameListAdapter_Factory.create(MembersInjectors.<GroupNameListAdapter>noOp());

    this.groupsListFragmentMembersInjector =
        GroupsListFragment_MembersInjector.create(
            groupsListPresenterProvider, groupNameListAdapterProvider);

    this.loanTransactionsPresenterProvider =
        LoanTransactionsPresenter_Factory.create(
            MembersInjectors.<LoanTransactionsPresenter>noOp(), dataManagerProvider);

    this.loanTransactionsFragmentMembersInjector =
        LoanTransactionsFragment_MembersInjector.create(loanTransactionsPresenterProvider);

    this.savingsAccountPresenterProvider =
        SavingsAccountPresenter_Factory.create(
            MembersInjectors.<SavingsAccountPresenter>noOp(), dataManagerSavingsProvider);

    this.savingsAccountFragmentMembersInjector =
        SavingsAccountFragment_MembersInjector.create(savingsAccountPresenterProvider);

    this.loanRepaymentPresenterProvider =
        LoanRepaymentPresenter_Factory.create(
            MembersInjectors.<LoanRepaymentPresenter>noOp(), dataManagerLoanProvider);

    this.loanRepaymentFragmentMembersInjector =
        LoanRepaymentFragment_MembersInjector.create(loanRepaymentPresenterProvider);

    this.groupLoanAccountPresenterProvider =
        GroupLoanAccountPresenter_Factory.create(
            MembersInjectors.<GroupLoanAccountPresenter>noOp(), dataManagerProvider);

    this.groupLoanAccountFragmentMembersInjector =
        GroupLoanAccountFragment_MembersInjector.create(groupLoanAccountPresenterProvider);

    this.loanAccountPresenterProvider =
        LoanAccountPresenter_Factory.create(
            MembersInjectors.<LoanAccountPresenter>noOp(), dataManagerLoanProvider);

    this.loanAccountFragmentMembersInjector =
        LoanAccountFragment_MembersInjector.create(loanAccountPresenterProvider);

    this.loanRepaymentSchedulePresenterProvider =
        LoanRepaymentSchedulePresenter_Factory.create(
            MembersInjectors.<LoanRepaymentSchedulePresenter>noOp(), dataManagerProvider);

    this.loanRepaymentScheduleFragmentMembersInjector =
        LoanRepaymentScheduleFragment_MembersInjector.create(
            loanRepaymentSchedulePresenterProvider);

    this.dataManagerSurveysProvider =
        new Factory<DataManagerSurveys>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManagerSurveys get() {
            return Preconditions.checkNotNull(
                applicationComponent.dataManagerSurveys(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.surveyListPresenterProvider =
        SurveyListPresenter_Factory.create(
            MembersInjectors.<SurveyListPresenter>noOp(), dataManagerSurveysProvider);

    this.surveyListFragmentMembersInjector =
        SurveyListFragment_MembersInjector.create(surveyListPresenterProvider);

    this.surveySubmitPresenterProvider =
        SurveySubmitPresenter_Factory.create(
            MembersInjectors.<SurveySubmitPresenter>noOp(), dataManagerSurveysProvider);

    this.surveySubmitFragmentMembersInjector =
        SurveySubmitFragment_MembersInjector.create(surveySubmitPresenterProvider);

    this.pinPointClientPresenterProvider =
        PinPointClientPresenter_Factory.create(
            MembersInjectors.<PinPointClientPresenter>noOp(), dataManagerProvider);

    this.pinpointClientActivityMembersInjector =
        PinpointClientActivity_MembersInjector.create(pinPointClientPresenterProvider);

    this.chargeDialogPresenterProvider =
        ChargeDialogPresenter_Factory.create(
            MembersInjectors.<ChargeDialogPresenter>noOp(), dataManagerProvider);

    this.chargeDialogFragmentMembersInjector =
        ChargeDialogFragment_MembersInjector.create(chargeDialogPresenterProvider);

    this.dataTableRowDialogPresenterProvider =
        DataTableRowDialogPresenter_Factory.create(
            MembersInjectors.<DataTableRowDialogPresenter>noOp(), dataManagerProvider);

    this.dataTableRowDialogFragmentMembersInjector =
        DataTableRowDialogFragment_MembersInjector.create(dataTableRowDialogPresenterProvider);

    this.documentDialogPresenterProvider =
        DocumentDialogPresenter_Factory.create(
            MembersInjectors.<DocumentDialogPresenter>noOp(), dataManagerDocumentProvider);

    this.documentDialogFragmentMembersInjector =
        DocumentDialogFragment_MembersInjector.create(documentDialogPresenterProvider);

    this.loanAccountApprovalPresenterProvider =
        LoanAccountApprovalPresenter_Factory.create(
            MembersInjectors.<LoanAccountApprovalPresenter>noOp(), dataManagerProvider);

    this.loanAccountApprovalMembersInjector =
        LoanAccountApproval_MembersInjector.create(loanAccountApprovalPresenterProvider);

    this.loanAccountDisbursementPresenterProvider =
        LoanAccountDisbursementPresenter_Factory.create(
            MembersInjectors.<LoanAccountDisbursementPresenter>noOp(), dataManagerProvider);

    this.loanAccountDisbursementMembersInjector =
        LoanAccountDisbursement_MembersInjector.create(loanAccountDisbursementPresenterProvider);

    this.loanChargeDialogPresenterProvider =
        LoanChargeDialogPresenter_Factory.create(
            MembersInjectors.<LoanChargeDialogPresenter>noOp(), dataManagerProvider);

    this.loanChargeDialogFragmentMembersInjector =
        LoanChargeDialogFragment_MembersInjector.create(loanChargeDialogPresenterProvider);

    this.savingsAccountApprovalPresenterProvider =
        SavingsAccountApprovalPresenter_Factory.create(
            MembersInjectors.<SavingsAccountApprovalPresenter>noOp(), dataManagerProvider);

    this.savingsAccountApprovalMembersInjector =
        SavingsAccountApproval_MembersInjector.create(savingsAccountApprovalPresenterProvider);

    this.syncClientPayloadsPresenterProvider =
        SyncClientPayloadsPresenter_Factory.create(
            MembersInjectors.<SyncClientPayloadsPresenter>noOp(), dataManagerClientProvider);

    this.syncClientPayloadsFragmentMembersInjector =
        SyncClientPayloadsFragment_MembersInjector.create(syncClientPayloadsPresenterProvider);

    this.syncGroupPayloadsPresenterProvider =
        SyncGroupPayloadsPresenter_Factory.create(
            MembersInjectors.<SyncGroupPayloadsPresenter>noOp(), dataManagerGroupsProvider);

    this.syncGroupPayloadAdapterProvider =
        SyncGroupPayloadAdapter_Factory.create(MembersInjectors.<SyncGroupPayloadAdapter>noOp());

    this.syncGroupPayloadsFragmentMembersInjector =
        SyncGroupPayloadsFragment_MembersInjector.create(
            syncGroupPayloadsPresenterProvider, syncGroupPayloadAdapterProvider);

    this.offlineDashboardPresenterProvider =
        OfflineDashboardPresenter_Factory.create(
            MembersInjectors.<OfflineDashboardPresenter>noOp(),
            dataManagerClientProvider,
            dataManagerGroupsProvider,
            dataManagerLoanProvider,
            dataManagerSavingsProvider);

    this.offlineDashboardAdapterProvider =
        OfflineDashboardAdapter_Factory.create(MembersInjectors.<OfflineDashboardAdapter>noOp());

    this.offlineDashboardFragmentMembersInjector =
        OfflineDashboardFragment_MembersInjector.create(
            offlineDashboardPresenterProvider, offlineDashboardAdapterProvider);

    this.syncLoanRepaymentTransactionPresenterProvider =
        SyncLoanRepaymentTransactionPresenter_Factory.create(
            MembersInjectors.<SyncLoanRepaymentTransactionPresenter>noOp(),
            dataManagerLoanProvider);
  }

  @SuppressWarnings("unchecked")
  private void initialize2(final Builder builder) {

    this.syncLoanRepaymentAdapterProvider =
        SyncLoanRepaymentAdapter_Factory.create(MembersInjectors.<SyncLoanRepaymentAdapter>noOp());

    this.syncLoanRepaymentTransactionFragmentMembersInjector =
        SyncLoanRepaymentTransactionFragment_MembersInjector.create(
            syncLoanRepaymentTransactionPresenterProvider, syncLoanRepaymentAdapterProvider);

    this.syncClientsDialogPresenterProvider =
        SyncClientsDialogPresenter_Factory.create(
            MembersInjectors.<SyncClientsDialogPresenter>noOp(),
            dataManagerClientProvider,
            dataManagerLoanProvider,
            dataManagerSavingsProvider);

    this.syncClientsDialogFragmentMembersInjector =
        SyncClientsDialogFragment_MembersInjector.create(syncClientsDialogPresenterProvider);

    this.syncSavingsAccountTransactionPresenterProvider =
        SyncSavingsAccountTransactionPresenter_Factory.create(
            MembersInjectors.<SyncSavingsAccountTransactionPresenter>noOp(),
            dataManagerSavingsProvider,
            dataManagerLoanProvider);

    this.syncSavingsAccountTransactionAdapterProvider =
        SyncSavingsAccountTransactionAdapter_Factory.create(
            MembersInjectors.<SyncSavingsAccountTransactionAdapter>noOp());

    this.syncSavingsAccountTransactionFragmentMembersInjector =
        SyncSavingsAccountTransactionFragment_MembersInjector.create(
            syncSavingsAccountTransactionPresenterProvider,
            syncSavingsAccountTransactionAdapterProvider);

    this.syncGroupsDialogPresenterProvider =
        SyncGroupsDialogPresenter_Factory.create(
            MembersInjectors.<SyncGroupsDialogPresenter>noOp(),
            dataManagerGroupsProvider,
            dataManagerLoanProvider,
            dataManagerSavingsProvider,
            dataManagerClientProvider);

    this.syncGroupsDialogFragmentMembersInjector =
        SyncGroupsDialogFragment_MembersInjector.create(syncGroupsDialogPresenterProvider);

    this.identifierDialogPresenterProvider =
        IdentifierDialogPresenter_Factory.create(
            MembersInjectors.<IdentifierDialogPresenter>noOp(), dataManagerClientProvider);

    this.identifierDialogFragmentMembersInjector =
        IdentifierDialogFragment_MembersInjector.create(identifierDialogPresenterProvider);
  }

  @Override
  public void inject(LoginActivity loginActivity) {
    loginActivityMembersInjector.injectMembers(loginActivity);
  }

  @Override
  public void inject(CenterListFragment centerListFragment) {
    centerListFragmentMembersInjector.injectMembers(centerListFragment);
  }

  @Override
  public void inject(ClientChargeFragment clientChargeFragment) {
    clientChargeFragmentMembersInjector.injectMembers(clientChargeFragment);
  }

  @Override
  public void inject(ClientListFragment clientListFragment) {
    clientListFragmentMembersInjector.injectMembers(clientListFragment);
  }

  @Override
  public void inject(ClientIdentifiersFragment clientIdentifiersFragment) {
    clientIdentifiersFragmentMembersInjector.injectMembers(clientIdentifiersFragment);
  }

  @Override
  public void inject(ClientSearchFragment clientSearchFragment) {
    clientSearchFragmentMembersInjector.injectMembers(clientSearchFragment);
  }

  @Override
  public void inject(DocumentListFragment documentListFragment) {
    documentListFragmentMembersInjector.injectMembers(documentListFragment);
  }

  @Override
  public void inject(GroupListFragment groupListFragment) {
    groupListFragmentMembersInjector.injectMembers(groupListFragment);
  }

  @Override
  public void inject(GenerateCollectionSheetFragment generateCollectionSheetFragment) {
    generateCollectionSheetFragmentMembersInjector.injectMembers(generateCollectionSheetFragment);
  }

  @Override
  public void inject(CreateNewCenterFragment createNewCenterFragment) {
    createNewCenterFragmentMembersInjector.injectMembers(createNewCenterFragment);
  }

  @Override
  public void inject(CreateNewGroupFragment createNewGroupFragment) {
    createNewGroupFragmentMembersInjector.injectMembers(createNewGroupFragment);
  }

  @Override
  public void inject(CreateNewClientFragment createNewClientFragment) {
    createNewClientFragmentMembersInjector.injectMembers(createNewClientFragment);
  }

  @Override
  public void inject(DataTableDataFragment dataTableDataFragment) {
    dataTableDataFragmentMembersInjector.injectMembers(dataTableDataFragment);
  }

  @Override
  public void inject(GroupDetailsFragment groupDetailsFragment) {
    groupDetailsFragmentMembersInjector.injectMembers(groupDetailsFragment);
  }

  @Override
  public void inject(ClientDetailsFragment clientDetailsFragment) {
    clientDetailsFragmentMembersInjector.injectMembers(clientDetailsFragment);
  }

  @Override
  public void inject(LoanAccountSummaryFragment loanAccountSummaryFragment) {
    loanAccountSummaryFragmentMembersInjector.injectMembers(loanAccountSummaryFragment);
  }

  @Override
  public void inject(SavingsAccountSummaryFragment savingsAccountSummaryFragment) {
    savingsAccountSummaryFragmentMembersInjector.injectMembers(savingsAccountSummaryFragment);
  }

  @Override
  public void inject(LoanChargeFragment loanChargeFragment) {
    loanChargeFragmentMembersInjector.injectMembers(loanChargeFragment);
  }

  @Override
  public void inject(SavingsAccountTransactionFragment savingsAccountTransactionFragment) {
    savingsAccountTransactionFragmentMembersInjector.injectMembers(
        savingsAccountTransactionFragment);
  }

  @Override
  public void inject(CollectionSheetFragment collectionSheetFragment) {
    collectionSheetFragmentMembersInjector.injectMembers(collectionSheetFragment);
  }

  @Override
  public void inject(GroupsListFragment groupsListFragment) {
    groupsListFragmentMembersInjector.injectMembers(groupsListFragment);
  }

  @Override
  public void inject(LoanTransactionsFragment loanTransactionsFragment) {
    loanTransactionsFragmentMembersInjector.injectMembers(loanTransactionsFragment);
  }

  @Override
  public void inject(SavingsAccountFragment savingsAccountFragment) {
    savingsAccountFragmentMembersInjector.injectMembers(savingsAccountFragment);
  }

  @Override
  public void inject(LoanRepaymentFragment loanRepaymentFragment) {
    loanRepaymentFragmentMembersInjector.injectMembers(loanRepaymentFragment);
  }

  @Override
  public void inject(GroupLoanAccountFragment groupLoanAccountFragment) {
    groupLoanAccountFragmentMembersInjector.injectMembers(groupLoanAccountFragment);
  }

  @Override
  public void inject(LoanAccountFragment loanAccountFragment) {
    loanAccountFragmentMembersInjector.injectMembers(loanAccountFragment);
  }

  @Override
  public void inject(LoanRepaymentScheduleFragment loanRepaymentScheduleFragment) {
    loanRepaymentScheduleFragmentMembersInjector.injectMembers(loanRepaymentScheduleFragment);
  }

  @Override
  public void inject(SurveyListFragment surveyListFragment) {
    surveyListFragmentMembersInjector.injectMembers(surveyListFragment);
  }

  @Override
  public void inject(SurveySubmitFragment surveySubmitFragment) {
    surveySubmitFragmentMembersInjector.injectMembers(surveySubmitFragment);
  }

  @Override
  public void inject(PinpointClientActivity pinpointClientActivity) {
    pinpointClientActivityMembersInjector.injectMembers(pinpointClientActivity);
  }

  @Override
  public void inject(ChargeDialogFragment chargeDialogFragment) {
    chargeDialogFragmentMembersInjector.injectMembers(chargeDialogFragment);
  }

  @Override
  public void inject(DataTableRowDialogFragment dataTableRowDialogFragment) {
    dataTableRowDialogFragmentMembersInjector.injectMembers(dataTableRowDialogFragment);
  }

  @Override
  public void inject(DocumentDialogFragment documentDialogFragment) {
    documentDialogFragmentMembersInjector.injectMembers(documentDialogFragment);
  }

  @Override
  public void inject(LoanAccountApproval loanAccountApproval) {
    loanAccountApprovalMembersInjector.injectMembers(loanAccountApproval);
  }

  @Override
  public void inject(LoanAccountDisbursement loanAccountDisbursement) {
    loanAccountDisbursementMembersInjector.injectMembers(loanAccountDisbursement);
  }

  @Override
  public void inject(LoanChargeDialogFragment loanChargeDialogFragment) {
    loanChargeDialogFragmentMembersInjector.injectMembers(loanChargeDialogFragment);
  }

  @Override
  public void inject(SavingsAccountApproval savingsAccountApproval) {
    savingsAccountApprovalMembersInjector.injectMembers(savingsAccountApproval);
  }

  @Override
  public void inject(SyncClientPayloadsFragment syncPayloadsFragment) {
    syncClientPayloadsFragmentMembersInjector.injectMembers(syncPayloadsFragment);
  }

  @Override
  public void inject(SyncGroupPayloadsFragment syncGroupPayloadsFragment) {
    syncGroupPayloadsFragmentMembersInjector.injectMembers(syncGroupPayloadsFragment);
  }

  @Override
  public void inject(OfflineDashboardFragment offlineDashboardFragment) {
    offlineDashboardFragmentMembersInjector.injectMembers(offlineDashboardFragment);
  }

  @Override
  public void inject(SyncLoanRepaymentTransactionFragment syncLoanRepaymentTransactionFragment) {
    syncLoanRepaymentTransactionFragmentMembersInjector.injectMembers(
        syncLoanRepaymentTransactionFragment);
  }

  @Override
  public void inject(SyncClientsDialogFragment syncClientsDialogFragment) {
    syncClientsDialogFragmentMembersInjector.injectMembers(syncClientsDialogFragment);
  }

  @Override
  public void inject(SyncSavingsAccountTransactionFragment syncSavingsAccountTransactionFragment) {
    syncSavingsAccountTransactionFragmentMembersInjector.injectMembers(
        syncSavingsAccountTransactionFragment);
  }

  @Override
  public void inject(SyncGroupsDialogFragment syncGroupsDialogFragment) {
    syncGroupsDialogFragmentMembersInjector.injectMembers(syncGroupsDialogFragment);
  }

  @Override
  public void inject(IdentifierDialogFragment identifierDialogFragment) {
    identifierDialogFragmentMembersInjector.injectMembers(identifierDialogFragment);
  }

  public static final class Builder {
    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder activityModule(ActivityModule activityModule) {
      Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
