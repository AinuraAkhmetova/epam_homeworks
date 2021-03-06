package homework_8.carrier.repo;

import homework_8.carrier.domain.Carrier;
import homework_8.common.business.repo.CommonRepo;

import java.util.List;

public interface CarrierRepo extends CommonRepo {

  void add(Carrier carrier);

  Carrier getById(long id);

  Carrier[] getByName(String name);

  List<Carrier> getAll();
}
