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
            url: '/konlor/api/clienteId/' + getUrlParameter('id'),
            contentType: 'application/json',
            method: 'GET',
            dataType: 'json'
        }).done(function (data) {
            var nombre = $('#Actualizar Cliente').val(data.nombreEstudiante);
            var apellido = $('#cedula').val(data.apellidoEstudiante);
            var correo = $('#edad').val(data.correoEstudiante);
            var codigo = $('#registro').val(data.codigoEstudiante);
            var id = data.id;

            $('#botonCrear').text('Actualizar Cliente').click(function (event) {
                var nombre = $('#nombre_cliente').val();
                var apellido = $('#cedula').val();
                var correo = $('#edad').val();
                var codigo = $('#registro').val();

                $.ajax({
                    url: '/konlor/api/clienteId/' + id,
                    contentType: 'application/json',
                    data: JSON.stringify({
                        nombreEstudiante: nombre,
                        apellidoEstudiante: apellido,
                        correoEstudiante: correo,
                        codigoEstudiante: codigo,
                        id:id
                    }),
                    method: 'PUT',
                    dataType: 'json'
                }).done(function (data) {
                    window.location.href='/konlor';
                }).fail(function (xhr, status, error) {
                    console.log(error);
                });
            })
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    } else {
        $('#botonCrear').click(function (event) {
            var nombre = $('#nombre_cliente').val();
            var apellido = $('#cedula').val();
            var correo = $('#edad').val();
            var codigo = $('#registro').val();
            $.ajax({
                url: '/konlor/api/clienteId/',
                contentType: 'application/json',
                data: JSON.stringify({
                    nombreEstudiante: nombre,
                    apellidoEstudiante: apellido,
                    correoEstudiante: correo,
                    codigoEstudiante: codigo
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