package lk.NextTravelPvt.Ltd.vishnuka084.userservice.feign;

import lk.NextTravelPvt.Ltd.vishnuka084.userservice.util.ResponseUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient("TRAVEL-PACKAGE-SERVICE")
public interface TravelPackage {

    @GetMapping(path = "api/v1/travelPackage/get/details",params = {"date"})
    ResponseUtil getDetails(String date);


    @GetMapping(path = "api/v1/travelPackage/find/all")
    ResponseUtil getAllPackages();
}