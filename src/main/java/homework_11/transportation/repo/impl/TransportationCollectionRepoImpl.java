package homework_11.transportation.repo.impl;


import static homework_11.storage.Storage.transportationCollection;

import homework_11.storage.IdGenerator;
import homework_11.transportation.domain.Transportation;
import homework_11.transportation.repo.TransportationRepo;

import java.util.Iterator;
import java.util.List;

public class TransportationCollectionRepoImpl implements TransportationRepo {

  @Override
  public void save(Transportation transportation) {
    transportation.setId(IdGenerator.generateId());
    transportationCollection.add(transportation);
  }

  @Override
  public Transportation findById(Long id) {
    for (Transportation transportation : transportationCollection) {
      if (transportation.getId().equals(id)) {
        return transportation;
      }
    }

    return null;
  }

  @Override
  public List<Transportation> getAll() {
    return transportationCollection;
  }

  @Override
  public boolean update(Transportation transportation) {
    return true;
  }

  @Override
  public boolean deleteById(Long id) {
    boolean deleted = false;

    Iterator<Transportation> iter = transportationCollection.iterator();
    while (iter.hasNext()) {
      if (iter.next().getId().equals(id)) {
        iter.remove();
        deleted = true;
        break;
      }
    }
    return deleted;
  }

  @Override
  public int countAll() {
    return transportationCollection.size();
  }
}
