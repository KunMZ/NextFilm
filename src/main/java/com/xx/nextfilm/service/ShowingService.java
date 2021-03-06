package com.xx.nextfilm.service;

import com.xx.nextfilm.dto.editor.ShowingEditor1;
import com.xx.nextfilm.dto.editor.ShowingEditor2;
import com.xx.nextfilm.dto.shower.ShowingShower2;
import com.xx.nextfilm.entity.*;

import java.util.Date;
import java.util.List;

/**
 * Created by CuiH on 2016/5/17.
 */
public interface ShowingService {

    ShowingEntity findShowingById(Long id, boolean needFcm, boolean needSeats, boolean needCinema);

    List<ShowingEntity> findShowingsByFCMAndDate(FCMEntity fcmEntity, Date date);

    List<ShowingEntity> findSomeShowingsByFCMAndDate(FCMEntity fcmEntity, Date date, int num);

    List<ShowingShower2> findShowingsByCinemaAndFilmWithShower2(CinemaEntity cinemaEntity, FilmEntity filmEntity);

    ShowingEditor2 getShowingEditor2ById(Long id);

    void createShowing(ShowingEditor1 showingEditor1);

    boolean updateShowing(ShowingEditor2 showingEditor2);

    void deleteShowing(ShowingEntity showingEntity);



    void admin(Long fcmId);

}
