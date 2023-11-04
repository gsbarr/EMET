package com.emet.api.Locations;

public class LocationsDaoImp implements LocationsDao {

    private LocationsRepository locationsRepository;

    @Override
    public Location getLocacionById(Long id) {
        Location loc = locationsRepository.findById(id).orElse(null);
        return loc;
    }

    @Override
    public void saveLocation(LocationData data) {
        Location loc = new Location();
        loc.setNombre(data.getNombre());
        loc.setTitular(data.getTitular());
        loc.setDireccion(data.getDireccion());
        loc.setCoordenadas(data.getCoordenadas());

        locationsRepository.save(loc);
    }
}
