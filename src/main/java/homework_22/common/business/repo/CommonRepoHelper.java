package homework_22.common.business.repo;

import homework_22.common.business.domain.BaseEntity;

import java.util.Optional;

public final class CommonRepoHelper {

  private CommonRepoHelper() {

  }

  public static Optional<Integer> findEntityIndexInArrayStorageById(BaseEntity[] data, long entityId) {
    for (int i = 0; i < data.length; i++) {
      if (Long.valueOf(entityId).equals(data[i].getId())) {
        return Optional.of(i);
      }
    }

    return Optional.empty();
  }
}
