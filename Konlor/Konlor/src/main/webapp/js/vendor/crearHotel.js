(function ($) {
    var getUrlParameter = function getUrlParameter(sParam) {
        var sPageUrl = decodeURIComponent(window.location.search.substring(1)),
                sURLVariables = sPageUrl.split('&'),
                sParameterName,
                i;
        for (var i = 0; i < sURLVariables.length; i++) {
            sParameterName = sURLVariables[i].split('=');
            if (sParameterName[0] === sParam) {
                return sParameterName[1] === undefined ? true : sParameterName[1];
            }
        }
    };

    if (getUrlParameter('id')) {
        $.ajax({
            url: '/konlor/api/hotelId/' + getUrlParameter('id'),
            contentType: 'application/json',
            method: 'GET',
            dataType: 'json'
        }).done(function (data) {
            var nom_hotel = $('#nom_hotel').val(data.nomHotel);
            var ubicacion = $('#ubicacion').val(data.Ubicacion);
            var id = data.id;

            $('#botonCrear').text('Actualizar Hotel').click(function (event) {
                var nom_hotel = $('#nom_hotel').val();
                var ubicacion = $('#ubicacion').val();

                $.ajax({
                    url: '/konlor/api/hotelId/' + id,
                    contentType: 'application/json',
                    data: JSON.stringify({
                        nomHotel: nom_hotel,
                        Ubicacion: ubicacion,
                        id: id
                    }),
                    method: 'PUT',
                    dataType: 'json'
                }).done(function (data) {
                    window.location.href = '/konlor';
                }).fail(function (xhr, status, error) {
                    console.log(error);
                });
            })
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    } else {
        $('#botonCrear').click(function (event) {
            var nom_hotel = $('#nom_hotel').val();
            var ubicacion = $('#ubicacion').val();
            $.ajax({
                url: '/konlor/api/hotelId/',
                contentType: 'application/json',
                data: JSON.stringify({
                    nomHotel: nom_hotel,
                    Ubicacion: ubicacion
                }),
                method: 'POST',
                dataType: 'json'
            }).done(function (data) {
                window.location.href = '/konlor';
            }).fail(function (xhr, status, error) {
                console.log(error);
            });
        });
    }


})(jQuery);