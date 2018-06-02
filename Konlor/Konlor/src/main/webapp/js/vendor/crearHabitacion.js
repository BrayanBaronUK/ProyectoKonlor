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
            url: '/konlor/api/habitacionId/' + getUrlParameter('id'),
            contentType: 'application/json',
            method: 'GET',
            dataType: 'json'
        }).done(function (data) {
            var num_habitacion = $('#num_habitacion').val(data.numHabitacion);
            var tipo_disponibilidad = $('#tipo_disponibilidad').val(data.tipoDisponibilidad);
            var id_hotel = $('#id_hotel').val(data.idHotel);
            var id_tipo = $('#id_tipo').val(data.idTipo);
            var id_disponibilidad = $('#id_disponibilidad').val(data.idDisponibilidad);
            var id = data.id;

            $('#botonCrear').text('Actualizar habitacion').click(function (event) {
                var num_habitacion = $('#num_habitacion').val();
                var tipo_disponibilidad = $('#tipo_disponibilidad').val();
                var id_hotel = $('#id_hotel').val();
                var id_tipo = $('#id_tipo').val();
                var id_disponibilidad = $('#id_disponibilidad').val();

                $.ajax({
                    url: '/konlor/api/habitacionId/' + id,
                    contentType: 'application/json',
                    data: JSON.stringify({
                        numHabitacion: num_habitacion,
                        tipoDisponibilidad: tipo_disponibilidad,
                        id_hotel: idHotel
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
                url: '/konlor/api/habitacionId/',
                contentType: 'application/json',
                data: JSON.stringify({
                          numHabitacion: num_habitacion,
                        tipoDisponibilidad: tipo_disponibilidad,
                        id_hotel: idHotel
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