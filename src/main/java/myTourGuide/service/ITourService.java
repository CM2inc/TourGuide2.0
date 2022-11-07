package myTourGuide.service;

import myTourGuide.dto.TourEntry;

import java.util.List;

/**
 * Journal Service handles business logic for Journal DTOs.
 */
public interface ITourService {

    /**
     * Save a new Tour Entry
     *
     * @param tourEntry the entry to save.
     * @return
     */
    TourEntry save(TourEntry tourEntry);

    /**
     * Return all journal entries.
     * @return a collection of all journal entries.
     */
    List<TourEntry> fetchAll();
}
