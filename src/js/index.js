function initMap() {
    const cincinnati = { lat: 39.103262656871856, lng: -84.51017273501337 };
    // The map, centered at Uluru
    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 12,
        center: cincinnati,
    });
    // The marker, positioned at Uluru
    const marker = new google.maps.Marker({
        position: cincinnati,
        map: map,
    });
}

window.initMap = initMap;