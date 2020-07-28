package org.jugnicaragua.demo.graphql.mutation;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.jugnicaragua.demo.dao.entity.Vehicle;
import org.jugnicaragua.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {
    @Autowired
    private VehicleService vehicleService;


    /**
     * corresponds to Mutation type in our schema definition.
     *
     * @param type
     * @param modelCode
     * @param brandName
     * @param launchDate
     * @return
     */
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

    /**
     * Corresponde a nuestra Muetacion para actualizar el color
     *
     * @param id
     * @param color
     * @return
     */
    public Vehicle updateColor(Integer id, final String color) {
        return this.vehicleService.updateColor(id, color);
    }
}

