package org.smartregister.chw.fp.contract;

import org.smartregister.view.contract.BaseProfileContract;

public interface BaseFpProfileContract {

    interface View extends BaseProfileContract.View {

        void openMedicalHistory();

        void openFamilyPlanningRegistration();

        void openUpcomingServices();

        void openFollowUpVisitForm();

        void refreshUpcomingServices();

        void refreshMedicalHistory();

        void setProfile();

        void setOverdueColor();

        void setDueColor();

        // hideView();

        // showProgressBar();

    }

    interface Presenter extends BaseProfileContract.Presenter {

        View getView();

        void refreshProfileInfo();

        void updateMedicalHistory();

        void updateUpcomingServices();

        void refreshFamilyStatus();

    }


    interface Model {

    }

    interface interactor {

        void fetchProfile(String baseEntityId); // Callback here
    }
}
