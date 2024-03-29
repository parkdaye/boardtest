var writepost = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            title: $('#title').val(),
            content: $('#content').val(),
            userId: $('#userId').val()
        };

        $.ajax({
            type: 'POST',
            url: '/boards/posts',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('글이 등록되었습니다.');
            location.href="./";
        }).fail(function (error) {
        	console.log(JSON.stringify(error));
            alert('error');
        });
    }
};

writepost.init();